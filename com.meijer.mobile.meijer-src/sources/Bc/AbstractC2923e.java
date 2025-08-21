package Bc;

import Bc.C2919a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* renamed from: Bc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2923e {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC2923e f2684a = a().f(10485760).d(HttpResponseStatus.SUCCESS_OK).b(10000).c(604800000).e(81920).a();

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();

    /* renamed from: Bc.e$a */
    static abstract class a {
        abstract AbstractC2923e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);

        a() {
        }
    }

    static a a() {
        return new C2919a.b();
    }

    AbstractC2923e() {
    }
}
