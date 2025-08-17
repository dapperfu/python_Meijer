package zc;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import zc.C18419a;

/* renamed from: zc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC18423e {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC18423e f171770a = a().f(10485760).d(HttpResponseStatus.SUCCESS_OK).b(10000).c(604800000).e(81920).a();

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();

    /* renamed from: zc.e$a */
    static abstract class a {
        abstract AbstractC18423e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);

        a() {
        }
    }

    static a a() {
        return new C18419a.b();
    }

    AbstractC18423e() {
    }
}
