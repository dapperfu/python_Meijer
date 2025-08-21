package Vr;

import Lu.g;
import Nr.f;
import bk.AbstractC6392a;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import dl.C13702d;
import ev.C13889a;
import io.reactivex.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import um.AbstractC17446a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LVr/e;", "Lum/a;", "", "imageUrl", "Ldl/d;", "couponsRepository", "<init>", "(Ljava/lang/String;Ldl/d;)V", "g0", "()Ljava/lang/String;", "", "i0", "(Ljava/lang/String;)V", "Lbk/a;", "d0", "()Lbk/a;", "", "f0", "()I", "couponTotal", "h0", "(I)V", "S", "()V", "d", "Ljava/lang/String;", "LJu/a;", "e", "LJu/a;", "disposables", "f", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends AbstractC17446a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String imageUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int couponTotal;

    @Override // um.AbstractC17446a
    public void S() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, C13702d couponsRepository) {
        super(null);
        Intrinsics.j(couponsRepository, "couponsRepository");
        this.imageUrl = str;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        String str2 = this.imageUrl;
        if (str2 == null || str2.length() == 0) {
            u<SpecialOffersUrlResponse> uVarQ = couponsRepository.u().k(Iu.a.a()).q(C13889a.b());
            final Function1 function1 = new Function1() { // from class: Vr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.Z(this.f40194a, (SpecialOffersUrlResponse) obj);
                }
            };
            g<? super SpecialOffersUrlResponse> gVar = new g() { // from class: Vr.b
                @Override // Lu.g
                public final void accept(Object obj) {
                    e.a0(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: Vr.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.b0((Throwable) obj);
                }
            };
            Ju.b bVarO = uVarQ.o(gVar, new g() { // from class: Vr.d
                @Override // Lu.g
                public final void accept(Object obj) {
                    e.c0(function12, obj);
                }
            });
            Intrinsics.i(bVarO, "subscribe(...)");
            aVar.b(bVarO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(e eVar, SpecialOffersUrlResponse response) {
        Intrinsics.j(response, "response");
        eVar.i0(response.getSpecialOffersBannerURL());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(Throwable exception) {
        Intrinsics.j(exception, "exception");
        qw.a.INSTANCE.f(exception, "Error loading SpecialOffers URL", new Object[0]);
        return Unit.f143329a;
    }

    public final AbstractC6392a d0() {
        return AbstractC6392a.INSTANCE.b(f.f22642f, this.couponTotal, new Object[0]);
    }

    public final int f0() {
        return this.couponTotal > 0 ? 0 : 8;
    }

    /* renamed from: g0, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void h0(int couponTotal) {
        this.couponTotal = couponTotal;
        notifyPropertyChanged(Nr.a.f22607b);
        notifyPropertyChanged(Nr.a.f22608c);
    }

    public final void i0(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(Nr.a.f22609d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
