package wa;

import android.content.Context;
import ha.C14490a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwa/b;", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "Lha/a;", "cacheableEventHandler", "Ln9/b;", "concurrentHandlerHolder", "", "name", "Lorg/json/JSONObject;", "payload", "<init>", "(Landroid/content/Context;Lha/a;Ln9/b;Ljava/lang/String;Lorg/json/JSONObject;)V", "", "run", "()V", "a", "Landroid/content/Context;", "b", "Lha/a;", "c", "Ln9/b;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class RunnableC17854b implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14490a cacheableEventHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final JSONObject payload;

    public RunnableC17854b(Context context, C14490a cacheableEventHandler, n9.b concurrentHandlerHolder, String name, JSONObject jSONObject) {
        Intrinsics.j(context, "context");
        Intrinsics.j(cacheableEventHandler, "cacheableEventHandler");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(name, "name");
        this.context = context;
        this.cacheableEventHandler = cacheableEventHandler;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.name = name;
        this.payload = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C14490a c14490a, RunnableC17854b runnableC17854b) {
        c14490a.a(runnableC17854b.context, runnableC17854b.getName(), runnableC17854b.getPayload());
    }

    /* renamed from: b, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public JSONObject getPayload() {
        return this.payload;
    }

    @Override // java.lang.Runnable
    public void run() {
        final C14490a c14490a = this.cacheableEventHandler;
        this.concurrentHandlerHolder.h(new Runnable() { // from class: wa.a
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC17854b.f(c14490a, this);
            }
        });
    }
}
