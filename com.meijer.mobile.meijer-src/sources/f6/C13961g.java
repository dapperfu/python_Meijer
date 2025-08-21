package f6;

import R5.A;
import R5.C5117d;
import R5.InterfaceC5125l;
import R5.K;
import R5.m;
import R5.o;
import R5.r;
import R5.t;
import R5.w;
import R5.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lf6/g;", "LR5/l;", "<init>", "()V", "LR5/d;", "entity", "LR5/x;", "d", "(LR5/d;)LR5/x;", "", "b", "(LR5/d;)I", "LR5/m;", "processingResult", "", "a", "(LR5/d;LR5/m;)V", "LR5/A;", "LR5/A;", "networkService", "signal_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: f6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13961g implements InterfaceC5125l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A networkService;

    @Override // R5.InterfaceC5125l
    public int b(C5117d entity) {
        Intrinsics.j(entity, "entity");
        return 30;
    }

    private final x d(C5117d entity) {
        C13959e c13959eA = C13959e.INSTANCE.a(entity);
        if (c13959eA.getUrl().length() == 0) {
            t.f("Signal", "SignalHitProcessor", "Failed to build Signal request (URL is null).", new Object[0]);
            return null;
        }
        int iD = c13959eA.d(0);
        if (iD <= 0) {
            iD = 2;
        }
        int i10 = iD;
        String body = c13959eA.getBody();
        r rVar = body.length() == 0 ? r.GET : r.POST;
        String contentType = c13959eA.getContentType();
        Map mapK = contentType.length() == 0 ? MapsKt.k() : MapsKt.g(TuplesKt.a("Content-Type", contentType));
        String url = c13959eA.getUrl();
        byte[] bytes = body.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
        return new x(url, rVar, bytes, mapK, i10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(m processingResult, x request, o oVar) {
        Intrinsics.j(processingResult, "$processingResult");
        Intrinsics.j(request, "$request");
        if (oVar == null) {
            t.a("Signal", "SignalHitProcessor", "Network request returned null connection. Will retry request later.", new Object[0]);
            processingResult.a(false);
            return;
        }
        int iD = oVar.d();
        C13956b c13956b = C13956b.f131598a;
        if (ArraysKt.W(c13956b.a(), iD)) {
            t.a("Signal", "SignalHitProcessor", "Signal request (" + request.f() + ") successfully sent.", new Object[0]);
            processingResult.a(true);
        } else if (ArraysKt.W(c13956b.b(), iD)) {
            t.a("Signal", "SignalHitProcessor", "Signal request failed with recoverable error (" + iD + ").Will retry sending the request (" + request.f() + ") later.", new Object[0]);
            processingResult.a(false);
        } else {
            t.f("Signal", "SignalHitProcessor", "Signal request (" + request.f() + ") failed with unrecoverable error (" + iD + ").", new Object[0]);
            processingResult.a(true);
        }
        Unit unit = Unit.f143329a;
        oVar.close();
    }

    @Override // R5.InterfaceC5125l
    public void a(C5117d entity, final m processingResult) {
        Intrinsics.j(entity, "entity");
        Intrinsics.j(processingResult, "processingResult");
        final x xVarD = d(entity);
        if (xVarD != null) {
            this.networkService.a(xVarD, new w() { // from class: f6.f
                @Override // R5.w
                public final void a(o oVar) {
                    C13961g.e(processingResult, xVarD, oVar);
                }
            });
            return;
        }
        t.f("Signal", "SignalHitProcessor", "Drop this data entity as it's not able to convert it to a valid Signal request: " + entity.a(), new Object[0]);
        processingResult.a(true);
    }

    public C13961g() {
        A aH = K.f().h();
        Intrinsics.i(aH, "getInstance().networkService");
        this.networkService = aH;
    }
}
