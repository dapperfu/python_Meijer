package Ti;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import requests.VertexRequest;
import responses.VertexResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LTi/a;", "", "Lrequests/VertexRequest;", "vertexRequest", "Lretrofit2/Response;", "Lresponses/VertexResponse;", "a", "(Lrequests/VertexRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface a {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("address/validate")
    Object a(@Body VertexRequest vertexRequest, Continuation<? super Response<VertexResponse>> continuation);
}
