package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.LinearLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13393m;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13393m extends LinearLayout implements InterfaceC13394n {

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f124353d = LazyKt.b(C13389i.f124347a);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f124354a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124355b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f124356c;

    public final void a(EnumC13390j value) {
        Intrinsics.j(value, "value");
        int i10 = 1;
        if ((getOrientation() == 1 ? EnumC13390j.f124349b : EnumC13390j.f124348a) != value) {
            int iOrdinal = value.ordinal();
            if (iOrdinal == 0) {
                i10 = 0;
            } else if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            setOrientation(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13393m(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f124354a = new LinkedHashMap();
        setBackground(getResources().getDrawable(R.drawable.sc_count_popup_background, context.getTheme()));
        setVisibility(4);
        setClipToOutline(true);
        this.f124356c = C13392l.f124352a;
    }

    public final Size b(EnumC13390j orientation) {
        int width;
        Intrinsics.j(orientation, "orientation");
        Collection collectionValues = this.f124354a.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (true) {
            width = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((C13387g) next).getVisibility() == 8)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C13387g c13387g = (C13387g) it2.next();
            c13387g.getClass();
            Lazy lazy = C13387g.f124338d;
            c13387g.f124345c.measure(View.MeasureSpec.makeMeasureSpec(((Number) lazy.getValue()).intValue() - (((Number) C13387g.f124342h.getValue()).intValue() * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            arrayList2.add(new Size(((Number) lazy.getValue()).intValue(), (((Number) C13387g.f124341g.getValue()).intValue() * 2) + ((Number) C13387g.f124340f.getValue()).intValue() + ((Number) C13387g.f124339e.getValue()).intValue() + c13387g.f124345c.getMeasuredHeight()));
        }
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                width += ((Size) it3.next()).getWidth();
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            int height = ((Size) it4.next()).getHeight();
            while (it4.hasNext()) {
                int height2 = ((Size) it4.next()).getHeight();
                if (height < height2) {
                    height = height2;
                }
            }
            return new Size(width, height);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it5 = arrayList2.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        int width2 = ((Size) it5.next()).getWidth();
        while (it5.hasNext()) {
            int width3 = ((Size) it5.next()).getWidth();
            if (width2 < width3) {
                width2 = width3;
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            width += ((Size) it6.next()).getHeight();
        }
        return new Size(width2, width);
    }

    public final void a() {
        if (this.f124355b) {
            ViewExtensionsKt.addRippleForeground(this);
            setOnClickListener(new View.OnClickListener() { // from class: Xt.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C13393m.a(this.f42668a, view);
                }
            });
        } else {
            setForeground(null);
            setOnClickListener(null);
        }
    }

    public static final void a(C13393m this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f124356c.invoke();
    }

    public final void a(LinearPopoverButtonViewSettings settings, Function0 onClick) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(onClick, "onClick");
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        C13387g c13387g = new C13387g(context, new C13391k(onClick));
        c13387g.a(settings);
        Intrinsics.j(this, "container");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) C13387g.f124338d.getValue()).intValue(), -1);
        layoutParams.gravity = 17;
        Lazy lazy = C13387g.f124341g;
        c13387g.setPadding(0, ((Number) lazy.getValue()).intValue(), 0, ((Number) lazy.getValue()).intValue());
        Unit unit = Unit.f143329a;
        addView(c13387g, layoutParams);
        LinkedHashMap linkedHashMap = this.f124354a;
        Pair pairA = TuplesKt.a(Integer.valueOf(settings.e()), c13387g);
        linkedHashMap.put(pairA.c(), pairA.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r4, boolean r5) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.f124354a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.scandit.datacapture.barcode.internal.module.ui.popover.g r4 = (com.scandit.datacapture.barcode.internal.module.ui.popover.C13387g) r4
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L1d
            int r2 = r4.getVisibility()
            if (r2 != 0) goto L18
            r2 = r1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r2 != r5) goto L1d
            r2 = r1
            goto L1e
        L1d:
            r2 = r0
        L1e:
            r1 = r1 ^ r2
            if (r4 != 0) goto L22
            return r1
        L22:
            if (r5 != 0) goto L26
            r0 = 8
        L26:
            r4.setVisibility(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.ui.popover.C13393m.a(int, boolean):boolean");
    }
}
