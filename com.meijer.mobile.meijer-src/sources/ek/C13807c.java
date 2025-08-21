package ek;

import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Iterator;
import java.util.Set;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m5.C15667f;
import m5.C15669h;
import m5.C15677p;
import m5.EnumC15663b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJC\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lek/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lm5/h$a;", "c", "(Landroid/content/Context;)Lm5/h$a;", "", "imageUrl", "Lm5/h;", "d", "(Landroid/content/Context;Ljava/lang/String;)Lm5/h;", "placeholderMemoryCacheKey", "", "errorImageResource", "placeholderImageResource", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lm5/h;", "Lm5/h$b;", "b", "Lm5/h$b;", "listener", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ek.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13807c {

    /* renamed from: a, reason: collision with root package name */
    public static final C13807c f130207a = new C13807c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C15669h.b listener = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f130209c = 8;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ek/c$a", "Lm5/h$b;", "Lm5/h;", "request", "Lm5/f;", "result", "", "a", "(Lm5/h;Lm5/f;)V", "Lm5/p;", "d", "(Lm5/h;Lm5/p;)V", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ek.c$a */
    public static final class a implements C15669h.b {
        @Override // m5.C15669h.b
        public void a(C15669h request, C15667f result) {
            Intrinsics.j(request, "request");
            Intrinsics.j(result, "result");
            qw.a.INSTANCE.u(result.getThrowable(), "Request coil: " + request.getData(), new Object[0]);
            super.a(request, result);
        }

        @Override // m5.C15669h.b
        public void d(C15669h request, C15677p result) {
            Intrinsics.j(request, "request");
            Intrinsics.j(result, "result");
            qw.a.INSTANCE.q(StringsKt.p(StringsKt.n("\n                    Request coil: " + request.getData() + "\n                    |    memKey: " + result.getMemoryCacheKey() + "\n                    |    disKey: " + result.getDiskCacheKey() + "\n                    |    isPlaceholder: " + result.getIsPlaceholderCached() + "\n                    |    datasource: " + result.getDataSource().name() + "\n                "), null, 1, null), new Object[0]);
            super.d(request, result);
        }

        a() {
        }
    }

    public static /* synthetic */ C15669h b(C13807c c13807c, Context context, String str, String str2, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = str;
        }
        if ((i10 & 8) != 0) {
            num = Integer.valueOf(C13813i.f130214a);
        }
        if ((i10 & 16) != 0) {
            num2 = Integer.valueOf(C13813i.f130214a);
        }
        return c13807c.a(context, str, str2, num, num2);
    }

    private final C15669h.a c(Context context) {
        return new C15669h.a(context).l(listener).e(true).d(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR).i(EnumC15663b.f150580c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C15669h a(Context context, String imageUrl, String placeholderMemoryCacheKey, Integer errorImageResource, Integer placeholderImageResource) {
        Set<InterfaceC15089c.Key> setB;
        Intrinsics.j(context, "context");
        InterfaceC15089c interfaceC15089cE = a5.a.a(context).e();
        InterfaceC15089c.Key key = null;
        if (interfaceC15089cE != null && (setB = interfaceC15089cE.b()) != null) {
            Iterator<T> it = setB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.e(((InterfaceC15089c.Key) next).getKey(), placeholderMemoryCacheKey)) {
                    key = next;
                    break;
                }
            }
            key = key;
        }
        return c(context).f(imageUrl).m(imageUrl).h(imageUrl).r(key).p(placeholderImageResource != null ? placeholderImageResource.intValue() : C13813i.f130214a).j(errorImageResource != null ? errorImageResource.intValue() : C13813i.f130214a).k(C13813i.f130214a).o(EnumC15663b.f150580c).c();
    }

    public final C15669h d(Context context, String imageUrl) {
        Intrinsics.j(context, "context");
        Intrinsics.j(imageUrl, "imageUrl");
        return c(context).f(imageUrl).m(imageUrl).h(imageUrl).q(imageUrl).o(EnumC15663b.f150583f).c();
    }

    private C13807c() {
    }
}
