const fs = require('fs');

function calculateRevenue() {
    const data = fs.readFileSync('./json/faturamento.json', 'utf8');
    const revenues = JSON.parse(data);

    let totalRevenue = 0;
    let lowestRevenue = null;
    let highestRevenue = null;
    let daysWithRevenue = 0;
    let daysAboveAverage = 0;

    revenues.forEach((item) => {
        if (item.valor > 0) {
            totalRevenue += item.valor;
            daysWithRevenue++;

            if (lowestRevenue === null || item.valor < lowestRevenue) {
                lowestRevenue = item.valor;
            }

            if (highestRevenue === null || item.valor > highestRevenue) {
                highestRevenue = item.valor;
            }
        }
    });

    const averageRevenue = daysWithRevenue > 0 ? totalRevenue / daysWithRevenue : 0;

    revenues.forEach((item) => {
        if (item.valor > averageRevenue) {
            daysAboveAverage++;
        }
    });

    console.log(`Menor faturamento: R$ ${lowestRevenue}`);
    console.log(`Maior faturamento: R$ ${highestRevenue}`);
    console.log(`Dias com faturamento superior à média: ${daysAboveAverage}`);
}

calculateRevenue();
