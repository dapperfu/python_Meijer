package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import android.widget.ImageView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f121799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f121800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, b bVar) {
        super(0);
        this.f121799a = mVar;
        this.f121800b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10;
        ImageView imageViewA = this.f121799a.a();
        b bVar = this.f121800b;
        if (Intrinsics.e(bVar, d.f121795a)) {
            i10 = R.drawable.sc_ic_status_none;
        } else if (Intrinsics.e(bVar, c.f121794a)) {
            i10 = R.drawable.sc_ic_status_not_available;
        } else {
            if (!(bVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (f.f121798a[((e) this.f121800b).f121796a.ordinal()]) {
                case 1:
                    i10 = R.drawable.sc_ic_status_none;
                    break;
                case 2:
                    i10 = R.drawable.sc_ic_status_not_available;
                    break;
                case 3:
                    i10 = R.drawable.sc_ic_status_expired;
                    break;
                case 4:
                    i10 = R.drawable.sc_ic_status_fragile;
                    break;
                case 5:
                    i10 = R.drawable.sc_ic_status_quality_check;
                    break;
                case 6:
                    i10 = R.drawable.sc_ic_status_low_stock;
                    break;
                case 7:
                    i10 = R.drawable.sc_ic_status_wrong;
                    break;
                case 8:
                    i10 = R.drawable.sc_ic_status_expiring_soon;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        FS.Resources_setImageResource(imageViewA, i10);
        return Unit.f142422a;
    }
}
