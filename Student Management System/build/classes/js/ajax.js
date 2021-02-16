function createRequestObject()
{
    var rq;
    if(window.XMLHttpRequest)
    {
        rq = new XMLHttpRequest();
    }
    else
    {
        alert('Browser is not supported');
        
    }
    return rq;
    
}
var http = createRequestObject();
function sendRequest(method, url)
{
   if (method == 'get'|| method == 'GET')
   {
   
       http.open(method,url);
       http.onreadystatechange=handleResponse;
       http.send(null);
       
   }
}
function handleResponse()
{

    if(http.readyState == 4  &&  http.status == 200)
    {
    
        var response = http.responseText;
        if(response)
        {
            document.getElementById("ajax_res").innerHTML=response;
        }
    }
}
