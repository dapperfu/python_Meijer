package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Gb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6876Gb0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f68080a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f68081b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f68082c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f68083d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f68084e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f68085f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f68086g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet f68087h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Map f68088i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f68089j;

    public final HashSet e() {
        return this.f68085f;
    }

    public final HashSet f() {
        return this.f68084e;
    }

    public final void h() {
        this.f68089j = true;
    }

    public final View a(String str) {
        return (View) this.f68082c.get(str);
    }

    public final C6842Fb0 b(View view) {
        C6842Fb0 c6842Fb0 = (C6842Fb0) this.f68081b.get(view);
        if (c6842Fb0 != null) {
            this.f68081b.remove(view);
        }
        return c6842Fb0;
    }

    public final String c(String str) {
        return (String) this.f68086g.get(str);
    }

    public final String d(View view) {
        if (this.f68080a.size() == 0) {
            return null;
        }
        String str = (String) this.f68080a.get(view);
        if (str != null) {
            this.f68080a.remove(view);
        }
        return str;
    }

    public final void g() {
        this.f68080a.clear();
        this.f68081b.clear();
        this.f68082c.clear();
        this.f68083d.clear();
        this.f68084e.clear();
        this.f68085f.clear();
        this.f68086g.clear();
        this.f68089j = false;
        this.f68087h.clear();
    }

    public final boolean j(String str) {
        return this.f68087h.contains(str);
    }

    public final boolean k(View view) {
        if (!this.f68088i.containsKey(view)) {
            return true;
        }
        this.f68088i.put(view, Boolean.TRUE);
        return false;
    }

    public final int l(View view) {
        if (this.f68083d.contains(view)) {
            return 1;
        }
        return this.f68089j ? 2 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        String str;
        Activity activity;
        boolean zIsInPictureInPictureMode;
        Boolean bool;
        C7817cb0 c7817cb0A = C7817cb0.a();
        if (c7817cb0A != null) {
            for (C7010Ka0 c7010Ka0 : c7817cb0A.b()) {
                View viewF = c7010Ka0.f();
                if (c7010Ka0.j()) {
                    String strH = c7010Ka0.h();
                    if (viewF != null) {
                        Context context = viewF.getContext();
                        while (true) {
                            str = null;
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                activity = null;
                                break;
                            }
                        }
                        if (activity != null) {
                            zIsInPictureInPictureMode = activity.isInPictureInPictureMode();
                        } else {
                            zIsInPictureInPictureMode = false;
                        }
                        if (zIsInPictureInPictureMode) {
                            this.f68087h.add(strH);
                        }
                        if (!viewF.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (viewF.hasWindowFocus()) {
                                this.f68088i.remove(viewF);
                                bool = Boolean.FALSE;
                            } else if (this.f68088i.containsKey(viewF)) {
                                bool = (Boolean) this.f68088i.get(viewF);
                            } else {
                                Map map = this.f68088i;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewF, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue() && !zIsInPictureInPictureMode) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewF;
                                while (true) {
                                    if (view != null) {
                                        String strA = C6808Eb0.a(view);
                                        if (strA != null) {
                                            str = strA;
                                            break;
                                        }
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.f68083d.addAll(hashSet);
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.f68084e.add(strH);
                            this.f68080a.put(viewF, strH);
                            for (C8137fb0 c8137fb0 : c7010Ka0.i()) {
                                View view2 = (View) c8137fb0.b().get();
                                if (view2 != null) {
                                    C6842Fb0 c6842Fb0 = (C6842Fb0) this.f68081b.get(view2);
                                    if (c6842Fb0 != null) {
                                        c6842Fb0.c(c7010Ka0.h());
                                    } else {
                                        this.f68081b.put(view2, new C6842Fb0(c8137fb0, c7010Ka0.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f68085f.add(strH);
                            this.f68082c.put(strH, viewF);
                            this.f68086g.put(strH, str);
                        }
                    } else {
                        this.f68085f.add(strH);
                        this.f68086g.put(strH, "noAdView");
                    }
                }
            }
        }
    }
}
