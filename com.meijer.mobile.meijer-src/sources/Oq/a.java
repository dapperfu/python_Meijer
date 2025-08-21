package Oq;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomListResponse;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.school.SchoolResponse;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LOq/a;", "", "", "zipCode", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "schoolId", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "a", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @GET("school/{id}")
    Object a(@Path(PreferencesHelper.PREF_ID) int i10, Continuation<? super Response<ClassroomListResponse>> continuation);

    @GET(PlaceTypes.SCHOOL)
    Object b(@Query("zip") int i10, Continuation<? super Response<List<SchoolResponse>>> continuation);
}
