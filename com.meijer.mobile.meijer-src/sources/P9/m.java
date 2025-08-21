package P9;

import D9.ResponseModel;
import android.os.Handler;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LP9/m;", "LS8/a;", "Landroid/os/Handler;", "handler", "completionHandler", "<init>", "(Landroid/os/Handler;LS8/a;)V", "", PreferencesHelper.PREF_ID, "LD9/c;", "responseModel", "", "b", "(Ljava/lang/String;LD9/c;)V", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Landroid/os/Handler;", "h", "()Landroid/os/Handler;", "LS8/a;", "g", "()LS8/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class m implements S8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final S8.a completionHandler;

    public m(Handler handler, S8.a completionHandler) {
        Intrinsics.j(handler, "handler");
        Intrinsics.j(completionHandler, "completionHandler");
        this.handler = handler;
        this.completionHandler = completionHandler;
    }

    @Override // S8.a
    public void a(final String id2, final Exception cause) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cause, "cause");
        getHandler().post(new Runnable() { // from class: P9.j
            @Override // java.lang.Runnable
            public final void run() {
                m.j(this.f25741a, id2, cause);
            }
        });
    }

    @Override // S8.a
    public void b(final String id2, final ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        getHandler().post(new Runnable() { // from class: P9.l
            @Override // java.lang.Runnable
            public final void run() {
                m.k(this.f25747a, id2, responseModel);
            }
        });
    }

    @Override // S8.a
    public void d(final String id2, final ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        getHandler().post(new Runnable() { // from class: P9.k
            @Override // java.lang.Runnable
            public final void run() {
                m.i(this.f25744a, id2, responseModel);
            }
        });
    }

    /* renamed from: g, reason: from getter */
    public S8.a getCompletionHandler() {
        return this.completionHandler;
    }

    /* renamed from: h, reason: from getter */
    public Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(m mVar, String str, ResponseModel responseModel) {
        mVar.getCompletionHandler().d(str, responseModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(m mVar, String str, Exception exc) {
        mVar.getCompletionHandler().a(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(m mVar, String str, ResponseModel responseModel) {
        mVar.getCompletionHandler().b(str, responseModel);
    }
}
