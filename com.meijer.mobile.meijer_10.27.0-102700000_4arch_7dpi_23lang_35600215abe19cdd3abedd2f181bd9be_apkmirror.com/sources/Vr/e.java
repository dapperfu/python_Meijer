package Vr;

import Nr.f;
import Pu.g;
import ak.AbstractC5607a;
import cl.C6412d;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import io.reactivex.u;
import iv.C14764a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tm.AbstractC17122a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LVr/e;", "Ltm/a;", "", "imageUrl", "Lcl/d;", "couponsRepository", "<init>", "(Ljava/lang/String;Lcl/d;)V", "g0", "()Ljava/lang/String;", "", "k0", "(Ljava/lang/String;)V", "Lak/a;", "d0", "()Lak/a;", "", "f0", "()I", "couponTotal", "h0", "(I)V", "S", "()V", "d", "Ljava/lang/String;", "LNu/a;", "e", "LNu/a;", "disposables", "f", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC17122a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String imageUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int couponTotal;

    @Override // tm.AbstractC17122a
    public void S() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, C6412d couponsRepository) {
        super(null);
        Intrinsics.j(couponsRepository, "couponsRepository");
        this.imageUrl = str;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        String str2 = this.imageUrl;
        if (str2 == null || str2.length() == 0) {
            u<SpecialOffersUrlResponse> uVarQ = couponsRepository.u().k(Mu.a.a()).q(C14764a.b());
            final Function1 function1 = new Function1() { // from class: Vr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.Y(this.f37767a, (SpecialOffersUrlResponse) obj);
                }
            };
            g<? super SpecialOffersUrlResponse> gVar = new g() { // from class: Vr.b
                @Override // Pu.g
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
            Nu.b bVarO = uVarQ.o(gVar, new g() { // from class: Vr.d
                @Override // Pu.g
                public final void accept(Object obj) {
                    e.c0(function12, obj);
                }
            });
            Intrinsics.i(bVarO, "subscribe(...)");
            aVar.a(bVarO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(e eVar, SpecialOffersUrlResponse response) {
        Intrinsics.j(response, "response");
        eVar.k0(response.getSpecialOffersBannerURL());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(Throwable exception) {
        Intrinsics.j(exception, "exception");
        uw.a.INSTANCE.f(exception, "Error loading SpecialOffers URL", new Object[0]);
        return Unit.f142422a;
    }

    public final AbstractC5607a d0() {
        return AbstractC5607a.INSTANCE.b(f.f22686f, this.couponTotal, new Object[0]);
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
        notifyPropertyChanged(Nr.a.f22651b);
        notifyPropertyChanged(Nr.a.f22652c);
    }

    public final void k0(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(Nr.a.f22653d);
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
