var df = new (Java.type("java.text.SimpleDateFormat"));
var date = new (Java.type("java.util.Date"));

console.log(date)
console.log('Hi, we\'re at SII Get Digital on ' + df.format(date))
