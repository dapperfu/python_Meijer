package No;

import com.meijer.mobile.core.util.moshi.SerializedNulls;
import com.meijer.mobile.core.util.moshi.Stringable;
import com.squareup.moshi.t;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zk.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"LNo/b;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "b", "Lkotlin/Lazy;", "()Lcom/squareup/moshi/t;", "productsMoshi", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22510a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy productsMoshi = LazyKt.b(new Function0() { // from class: No.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final t c() {
        return new t.a().a(c.a.f172813a).a(SerializedNulls.a.f97012a).a(Stringable.b.f97014a).d();
    }

    public final t b() {
        Object value = productsMoshi.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (t) value;
    }

    private b() {
    }
}
