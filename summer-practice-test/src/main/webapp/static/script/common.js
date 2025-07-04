window.onload = function() {
    const dataCurenta = new Date();
    const dataFormata = `${dataCurenta.getDate()}/${dataCurenta.getMonth() + 1}/${dataCurenta.getFullYear()}`;
    document.getElementById("data").innerHTML = dataFormata;

    setInterval(myTimer, 1000);

    function myTimer() {
        const date = new Date();
        document.getElementById("ora").innerHTML = date.toLocaleTimeString();
    }
}