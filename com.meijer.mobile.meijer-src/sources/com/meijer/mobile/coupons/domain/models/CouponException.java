package com.meijer.mobile.coupons.domain.models;

import Pk.Coupon;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/coupons/domain/models/CouponException;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "LPk/a;", "coupon", "<init>", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;LPk/a;)V", "", "throwable", "(Ljava/lang/Throwable;LPk/a;)V", "f", "LPk/a;", "h", "()LPk/a;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CouponException extends RetrofitException {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Coupon coupon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponException(RetrofitException exception, Coupon coupon) {
        super(exception.getMessage(), exception.getUrl(), exception.d(), exception.getExceptionKind(), exception, exception.getErrorType());
        Intrinsics.j(exception, "exception");
        Intrinsics.j(coupon, "coupon");
        this.coupon = coupon;
    }

    /* renamed from: h, reason: from getter */
    public final Coupon getCoupon() {
        return this.coupon;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CouponException(Throwable throwable, Coupon coupon) {
        RetrofitException retrofitExceptionE;
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(coupon, "coupon");
        if (throwable instanceof RetrofitException) {
            retrofitExceptionE = (RetrofitException) throwable;
        } else {
            retrofitExceptionE = RetrofitException.INSTANCE.e(AddOfferErrorType.UNKNOWN_ERROR, throwable);
        }
        this(retrofitExceptionE, coupon);
    }
}
