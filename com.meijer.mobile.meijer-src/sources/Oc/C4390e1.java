package Oc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: Oc.e1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4390e1 {

    /* renamed from: g, reason: collision with root package name */
    private String f23423g;

    /* renamed from: i, reason: collision with root package name */
    private String f23425i;

    /* renamed from: j, reason: collision with root package name */
    private String f23426j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23428l;

    /* renamed from: m, reason: collision with root package name */
    private String f23429m;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f23417a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f23418b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f23419c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f23420d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f23421e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f23422f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List f23424h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f23427k = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f23430n = 60000;

    @Deprecated
    public final void a(boolean z10) {
        this.f23427k = z10 ? 1 : 0;
    }

    public final void p(String str, String str2) {
        this.f23421e.putString(str, str2);
    }

    public final void q(String str) {
        this.f23417a.add(str);
    }

    public final void r(Class cls, Bundle bundle) {
        this.f23418b.putBundle(cls.getName(), bundle);
    }

    public final void s(String str) {
        this.f23420d.add(str);
    }

    public final void t(String str) {
        this.f23420d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void u(boolean z10) {
        this.f23428l = z10;
    }
}
