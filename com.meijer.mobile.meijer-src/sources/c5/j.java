package c5;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f61335a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static Function3<B, Composer, Integer, Unit> f61336b = ComposableLambdaKt.composableLambdaInstance(-1783408023, false, a.f61337a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function3<B, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f61337a = new a();

        public final void a(B b10, Composer composer, int i10) {
            int i11;
            if ((i10 & 14) == 0) {
                i11 = i10 | (composer.V(b10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && composer.j()) {
                composer.K();
            } else {
                z.e(b10, null, null, null, null, null, 0.0f, null, false, composer, i11 & 14, l3.f93323c);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(B b10, Composer composer, Integer num) {
            a(b10, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    public final Function3<B, Composer, Integer, Unit> a() {
        return f61336b;
    }
}
