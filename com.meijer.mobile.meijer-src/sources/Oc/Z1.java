package Oc;

import Gc.o;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f23380a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f23381b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f23382c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f23383d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f23384e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f23385f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f23386g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f23387h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f23388i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f23389j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f23390k = 60000;

    /* renamed from: l, reason: collision with root package name */
    private final int f23391l = o.b.DEFAULT.a();

    /* renamed from: m, reason: collision with root package name */
    private long f23392m = 0;

    public final Y1 a() {
        Bundle bundle = this.f23384e;
        Bundle bundle2 = this.f23380a;
        Bundle bundle3 = this.f23385f;
        return new Y1(8, -1L, bundle2, -1, this.f23381b, this.f23382c, this.f23383d, false, null, null, null, null, bundle, bundle3, this.f23386g, null, null, false, null, this.f23387h, this.f23388i, this.f23389j, this.f23390k, null, this.f23391l, this.f23392m);
    }

    public final Z1 b(Bundle bundle) {
        this.f23380a = bundle;
        return this;
    }

    public final Z1 c(int i10) {
        this.f23390k = i10;
        return this;
    }

    public final Z1 d(boolean z10) {
        this.f23382c = z10;
        return this;
    }

    public final Z1 e(List list) {
        this.f23381b = list;
        return this;
    }

    public final Z1 f(String str) {
        this.f23388i = str;
        return this;
    }

    public final Z1 g(long j10) {
        this.f23392m = j10;
        return this;
    }

    public final Z1 h(int i10) {
        this.f23383d = i10;
        return this;
    }

    public final Z1 i(int i10) {
        this.f23387h = i10;
        return this;
    }
}
