package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f0 extends Handler implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(SparkScanViewPresenter parent) {
        super(Looper.getMainLooper());
        Intrinsics.j(parent, "parent");
        this.f124074a = new WeakReference(parent);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) this.f124074a.get();
        if (sparkScanViewPresenter == null) {
            return;
        }
        switch (msg.what) {
            case 1:
                Object obj = msg.obj;
                sparkScanViewPresenter.n(Intrinsics.e(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE));
                break;
            case 2:
                Object obj2 = msg.obj;
                sparkScanViewPresenter.m(Intrinsics.e(obj2 instanceof Boolean ? (Boolean) obj2 : null, Boolean.TRUE));
                break;
            case 4:
                sparkScanViewPresenter.O();
                break;
            case 5:
                Object obj3 = msg.obj;
                Intrinsics.h(obj3, "null cannot be cast to non-null type com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback.Error");
                sparkScanViewPresenter.a((SparkScanBarcodeFeedback.Error) obj3);
                break;
            case 6:
                Object obj4 = msg.obj;
                Intrinsics.h(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.j(((Boolean) obj4).booleanValue());
                break;
            case 7:
                Object obj5 = msg.obj;
                Intrinsics.h(obj5, "null cannot be cast to non-null type com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback.Success");
                sparkScanViewPresenter.a((SparkScanBarcodeFeedback.Success) obj5);
                break;
            case 9:
                sparkScanViewPresenter.a();
                break;
            case 10:
                sparkScanViewPresenter.g();
                break;
            case 12:
                sparkScanViewPresenter.q();
                break;
            case 14:
                sparkScanViewPresenter.d();
                break;
            case 15:
                sparkScanViewPresenter.e();
                break;
            case 16:
                sparkScanViewPresenter.r();
                break;
            case 19:
                SparkScanViewPresenter.a(sparkScanViewPresenter, false, false, 6);
                break;
            case 20:
                Object obj6 = msg.obj;
                Intrinsics.h(obj6, "null cannot be cast to non-null type kotlin.String");
                sparkScanViewPresenter.a((String) obj6);
                break;
            case 21:
                sparkScanViewPresenter.k();
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                sparkScanViewPresenter.j();
                break;
            case 23:
                sparkScanViewPresenter.l();
                break;
            case 25:
                sparkScanViewPresenter.p();
                break;
            case 26:
                Object obj7 = msg.obj;
                Intrinsics.h(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.g(((Boolean) obj7).booleanValue());
                break;
            case 27:
                sparkScanViewPresenter.n();
                break;
            case 28:
                Object obj8 = msg.obj;
                Intrinsics.h(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.d(((Boolean) obj8).booleanValue());
                break;
            case 29:
                sparkScanViewPresenter.f();
                break;
            case 30:
                Object obj9 = msg.obj;
                Intrinsics.h(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.f(((Boolean) obj9).booleanValue());
                break;
            case 31:
                sparkScanViewPresenter.m();
                break;
            case l3.f93325e /* 32 */:
                sparkScanViewPresenter.o();
                break;
            case 33:
                Object obj10 = msg.obj;
                Intrinsics.h(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.c(((Boolean) obj10).booleanValue());
                break;
            case 34:
                Object obj11 = msg.obj;
                Intrinsics.h(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.e(((Boolean) obj11).booleanValue());
                break;
            case 35:
                Object obj12 = msg.obj;
                Intrinsics.h(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.b(((Boolean) obj12).booleanValue());
                break;
            case 36:
                sparkScanViewPresenter.i();
                break;
            case 37:
                sparkScanViewPresenter.h();
                break;
        }
    }
}
