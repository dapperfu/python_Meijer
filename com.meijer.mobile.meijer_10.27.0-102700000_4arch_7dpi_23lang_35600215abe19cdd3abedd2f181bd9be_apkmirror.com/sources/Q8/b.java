package Q8;

import B9.ResponseModel;
import com.emarsys.core.api.ResponseErrorException;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LQ8/b;", "LQ8/a;", "LQ8/d;", "Ly9/c;", "LV8/a;", "", "", "completionListenerMap", "<init>", "(Ljava/util/Map;)V", PreferencesHelper.PREF_ID, "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "e", "(Ljava/lang/String;Ljava/lang/Exception;)V", "model", "listener", "f", "(Ly9/c;LV8/a;)V", "LB9/c;", "responseModel", "d", "(Ljava/lang/String;LB9/c;)V", "a", "b", "Ljava/util/Map;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b implements a, d<y9.c, V8.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, V8.a> completionListenerMap;

    public b(Map<String, V8.a> completionListenerMap) {
        Intrinsics.j(completionListenerMap, "completionListenerMap");
        this.completionListenerMap = completionListenerMap;
    }

    private void e(String id2, Exception cause) {
        V8.a aVar = this.completionListenerMap.get(id2);
        if (aVar != null) {
            aVar.a(cause);
            this.completionListenerMap.remove(id2);
        }
    }

    @Override // Q8.a
    public void a(String id2, Exception cause) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cause, "cause");
        e(id2, cause);
    }

    @Override // Q8.a
    public void b(String id2, ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        e(id2, new ResponseErrorException(responseModel.getStatusCode(), responseModel.getMessage(), responseModel.getBody()));
    }

    @Override // Q8.a
    public void d(String id2, ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        e(id2, null);
    }

    @Override // Q8.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(y9.c model, V8.a listener) {
        Intrinsics.j(model, "model");
        if (listener != null) {
            this.completionListenerMap.put(model.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), listener);
        }
    }
}
