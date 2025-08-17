package Mc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: Mc.e1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4112e1 {

    /* renamed from: g, reason: collision with root package name */
    private String f19236g;

    /* renamed from: i, reason: collision with root package name */
    private String f19238i;

    /* renamed from: j, reason: collision with root package name */
    private String f19239j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19241l;

    /* renamed from: m, reason: collision with root package name */
    private String f19242m;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f19230a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f19231b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f19232c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f19233d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f19234e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f19235f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List f19237h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f19240k = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f19243n = 60000;

    @Deprecated
    public final void a(boolean z10) {
        this.f19240k = z10 ? 1 : 0;
    }

    public final void p(String str, String str2) {
        this.f19234e.putString(str, str2);
    }

    public final void q(String str) {
        this.f19230a.add(str);
    }

    public final void r(Class cls, Bundle bundle) {
        this.f19231b.putBundle(cls.getName(), bundle);
    }

    public final void s(String str) {
        this.f19233d.add(str);
    }

    public final void t(String str) {
        this.f19233d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void u(boolean z10) {
        this.f19241l = z10;
    }
}
