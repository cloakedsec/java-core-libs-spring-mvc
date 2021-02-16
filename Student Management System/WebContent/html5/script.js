function getStuff(){
    document.querySelector('#tuna').onclick=talk;
}
function talk() {
  alert('Close this page! Loading...');
}
window.onload=getStuff;
