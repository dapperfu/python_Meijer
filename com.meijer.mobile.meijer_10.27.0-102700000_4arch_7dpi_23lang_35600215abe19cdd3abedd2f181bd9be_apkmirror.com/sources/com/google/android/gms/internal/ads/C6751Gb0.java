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
public final class C6751Gb0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f67240a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f67241b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f67242c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f67243d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f67244e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f67245f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f67246g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet f67247h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Map f67248i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f67249j;

    public final HashSet e() {
        return this.f67245f;
    }

    public final HashSet f() {
        return this.f67244e;
    }

    public final void h() {
        this.f67249j = true;
    }

    public final View a(String str) {
        return (View) this.f67242c.get(str);
    }

    public final C6717Fb0 b(View view) {
        C6717Fb0 c6717Fb0 = (C6717Fb0) this.f67241b.get(view);
        if (c6717Fb0 != null) {
            this.f67241b.remove(view);
        }
        return c6717Fb0;
    }

    public final String c(String str) {
        return (String) this.f67246g.get(str);
    }

    public final String d(View view) {
        if (this.f67240a.size() == 0) {
            return null;
        }
        String str = (String) this.f67240a.get(view);
        if (str != null) {
            this.f67240a.remove(view);
        }
        return str;
    }

    public final void g() {
        this.f67240a.clear();
        this.f67241b.clear();
        this.f67242c.clear();
        this.f67243d.clear();
        this.f67244e.clear();
        this.f67245f.clear();
        this.f67246g.clear();
        this.f67249j = false;
        this.f67247h.clear();
    }

    public final boolean j(String str) {
        return this.f67247h.contains(str);
    }

    public final boolean k(View view) {
        if (!this.f67248i.containsKey(view)) {
            return true;
        }
        this.f67248i.put(view, Boolean.TRUE);
        return false;
    }

    public final int l(View view) {
        if (this.f67243d.contains(view)) {
            return 1;
        }
        return this.f67249j ? 2 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        String str;
        Activity activity;
        boolean zIsInPictureInPictureMode;
        Boolean bool;
        C7692cb0 c7692cb0A = C7692cb0.a();
        if (c7692cb0A != null) {
            for (C6885Ka0 c6885Ka0 : c7692cb0A.b()) {
                View viewF = c6885Ka0.f();
                if (c6885Ka0.j()) {
                    String strH = c6885Ka0.h();
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
                            this.f67247h.add(strH);
                        }
                        if (!viewF.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (viewF.hasWindowFocus()) {
                                this.f67248i.remove(viewF);
                                bool = Boolean.FALSE;
                            } else if (this.f67248i.containsKey(viewF)) {
                                bool = (Boolean) this.f67248i.get(viewF);
                            } else {
                                Map map = this.f67248i;
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
                                        String strA = C6683Eb0.a(view);
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
                                        this.f67243d.addAll(hashSet);
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.f67244e.add(strH);
                            this.f67240a.put(viewF, strH);
                            for (C8012fb0 c8012fb0 : c6885Ka0.i()) {
                                View view2 = (View) c8012fb0.b().get();
                                if (view2 != null) {
                                    C6717Fb0 c6717Fb0 = (C6717Fb0) this.f67241b.get(view2);
                                    if (c6717Fb0 != null) {
                                        c6717Fb0.c(c6885Ka0.h());
                                    } else {
                                        this.f67241b.put(view2, new C6717Fb0(c8012fb0, c6885Ka0.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f67245f.add(strH);
                            this.f67242c.put(strH, viewF);
                            this.f67246g.put(strH, str);
                        }
                    } else {
                        this.f67245f.add(strH);
                        this.f67246g.put(strH, "noAdView");
                    }
                }
            }
        }
    }
}
