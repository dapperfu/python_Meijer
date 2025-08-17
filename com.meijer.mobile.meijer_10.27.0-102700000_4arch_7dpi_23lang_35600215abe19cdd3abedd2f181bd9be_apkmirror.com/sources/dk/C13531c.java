package dk;

import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j5.InterfaceC14857c;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l5.C15370f;
import l5.C15372h;
import l5.C15380p;
import l5.EnumC15366b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJC\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ldk/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll5/h$a;", "c", "(Landroid/content/Context;)Ll5/h$a;", "", "imageUrl", "Ll5/h;", "d", "(Landroid/content/Context;Ljava/lang/String;)Ll5/h;", "placeholderMemoryCacheKey", "", "errorImageResource", "placeholderImageResource", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ll5/h;", "Ll5/h$b;", "b", "Ll5/h$b;", "listener", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dk.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13531c {

    /* renamed from: a, reason: collision with root package name */
    public static final C13531c f127431a = new C13531c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C15372h.b listener = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f127433c = 8;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dk/c$a", "Ll5/h$b;", "Ll5/h;", "request", "Ll5/f;", "result", "", "c", "(Ll5/h;Ll5/f;)V", "Ll5/p;", "b", "(Ll5/h;Ll5/p;)V", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dk.c$a */
    public static final class a implements C15372h.b {
        @Override // l5.C15372h.b
        public void b(C15372h request, C15380p result) {
            Intrinsics.j(request, "request");
            Intrinsics.j(result, "result");
            uw.a.INSTANCE.q(StringsKt.p(StringsKt.n("\n                    Request coil: " + request.getData() + "\n                    |    memKey: " + result.getMemoryCacheKey() + "\n                    |    disKey: " + result.getDiskCacheKey() + "\n                    |    isPlaceholder: " + result.getIsPlaceholderCached() + "\n                    |    datasource: " + result.getDataSource().name() + "\n                "), null, 1, null), new Object[0]);
            super.b(request, result);
        }

        @Override // l5.C15372h.b
        public void c(C15372h request, C15370f result) {
            Intrinsics.j(request, "request");
            Intrinsics.j(result, "result");
            uw.a.INSTANCE.u(result.getThrowable(), "Request coil: " + request.getData(), new Object[0]);
            super.c(request, result);
        }

        a() {
        }
    }

    public static /* synthetic */ C15372h b(C13531c c13531c, Context context, String str, String str2, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = str;
        }
        if ((i10 & 8) != 0) {
            num = Integer.valueOf(C13537i.f127438a);
        }
        if ((i10 & 16) != 0) {
            num2 = Integer.valueOf(C13537i.f127438a);
        }
        return c13531c.a(context, str, str2, num, num2);
    }

    private final C15372h.a c(Context context) {
        return new C15372h.a(context).l(listener).e(true).d(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR).i(EnumC15366b.f148510c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C15372h a(Context context, String imageUrl, String placeholderMemoryCacheKey, Integer errorImageResource, Integer placeholderImageResource) {
        Set<InterfaceC14857c.Key> setC;
        Intrinsics.j(context, "context");
        InterfaceC14857c interfaceC14857cE = Z4.a.a(context).e();
        InterfaceC14857c.Key key = null;
        if (interfaceC14857cE != null && (setC = interfaceC14857cE.c()) != null) {
            Iterator<T> it = setC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.e(((InterfaceC14857c.Key) next).getKey(), placeholderMemoryCacheKey)) {
                    key = next;
                    break;
                }
            }
            key = key;
        }
        return c(context).f(imageUrl).n(imageUrl).h(imageUrl).q(key).p(placeholderImageResource != null ? placeholderImageResource.intValue() : C13537i.f127438a).j(errorImageResource != null ? errorImageResource.intValue() : C13537i.f127438a).k(C13537i.f127438a).o(EnumC15366b.f148510c).c();
    }

    public final C15372h d(Context context, String imageUrl) {
        Intrinsics.j(context, "context");
        Intrinsics.j(imageUrl, "imageUrl");
        return c(context).f(imageUrl).n(imageUrl).h(imageUrl).r(imageUrl).o(EnumC15366b.f148513f).c();
    }

    private C13531c() {
    }
}
