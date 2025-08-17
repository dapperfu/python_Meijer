package Mc;

import Ec.o;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f19193a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f19194b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f19195c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f19196d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f19197e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f19198f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f19199g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f19200h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f19201i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f19202j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f19203k = 60000;

    /* renamed from: l, reason: collision with root package name */
    private final int f19204l = o.b.DEFAULT.a();

    /* renamed from: m, reason: collision with root package name */
    private long f19205m = 0;

    public final Y1 a() {
        Bundle bundle = this.f19197e;
        Bundle bundle2 = this.f19193a;
        Bundle bundle3 = this.f19198f;
        return new Y1(8, -1L, bundle2, -1, this.f19194b, this.f19195c, this.f19196d, false, null, null, null, null, bundle, bundle3, this.f19199g, null, null, false, null, this.f19200h, this.f19201i, this.f19202j, this.f19203k, null, this.f19204l, this.f19205m);
    }

    public final Z1 b(Bundle bundle) {
        this.f19193a = bundle;
        return this;
    }

    public final Z1 c(int i10) {
        this.f19203k = i10;
        return this;
    }

    public final Z1 d(boolean z10) {
        this.f19195c = z10;
        return this;
    }

    public final Z1 e(List list) {
        this.f19194b = list;
        return this;
    }

    public final Z1 f(String str) {
        this.f19201i = str;
        return this;
    }

    public final Z1 g(long j10) {
        this.f19205m = j10;
        return this;
    }

    public final Z1 h(int i10) {
        this.f19196d = i10;
        return this;
    }

    public final Z1 i(int i10) {
        this.f19200h = i10;
        return this;
    }
}
