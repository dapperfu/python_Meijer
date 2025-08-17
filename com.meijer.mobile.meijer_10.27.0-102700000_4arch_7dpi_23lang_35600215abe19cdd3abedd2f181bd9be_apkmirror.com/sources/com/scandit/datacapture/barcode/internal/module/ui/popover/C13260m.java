package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.LinearLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13260m;
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
/* loaded from: classes11.dex */
public final class C13260m extends LinearLayout implements InterfaceC13261n {

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f123401d = LazyKt.b(C13256i.f123395a);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f123402a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123403b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f123404c;

    public final void a(EnumC13257j value) {
        Intrinsics.j(value, "value");
        int i10 = 1;
        if ((getOrientation() == 1 ? EnumC13257j.f123397b : EnumC13257j.f123396a) != value) {
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
    public C13260m(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f123402a = new LinkedHashMap();
        setBackground(getResources().getDrawable(R.drawable.sc_count_popup_background, context.getTheme()));
        setVisibility(4);
        setClipToOutline(true);
        this.f123404c = C13259l.f123400a;
    }

    public final Size b(EnumC13257j orientation) {
        int width;
        Intrinsics.j(orientation, "orientation");
        Collection collectionValues = this.f123402a.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (true) {
            width = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((C13254g) next).getVisibility() == 8)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C13254g c13254g = (C13254g) it2.next();
            c13254g.getClass();
            Lazy lazy = C13254g.f123386d;
            c13254g.f123393c.measure(View.MeasureSpec.makeMeasureSpec(((Number) lazy.getValue()).intValue() - (((Number) C13254g.f123390h.getValue()).intValue() * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            arrayList2.add(new Size(((Number) lazy.getValue()).intValue(), (((Number) C13254g.f123389g.getValue()).intValue() * 2) + ((Number) C13254g.f123388f.getValue()).intValue() + ((Number) C13254g.f123387e.getValue()).intValue() + c13254g.f123393c.getMeasuredHeight()));
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
        if (this.f123403b) {
            ViewExtensionsKt.addRippleForeground(this);
            setOnClickListener(new View.OnClickListener() { // from class: Xt.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C13260m.a(this.f39819a, view);
                }
            });
        } else {
            setForeground(null);
            setOnClickListener(null);
        }
    }

    public static final void a(C13260m this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123404c.invoke();
    }

    public final void a(LinearPopoverButtonViewSettings settings, Function0 onClick) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(onClick, "onClick");
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        C13254g c13254g = new C13254g(context, new C13258k(onClick));
        c13254g.a(settings);
        Intrinsics.j(this, "container");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) C13254g.f123386d.getValue()).intValue(), -1);
        layoutParams.gravity = 17;
        Lazy lazy = C13254g.f123389g;
        c13254g.setPadding(0, ((Number) lazy.getValue()).intValue(), 0, ((Number) lazy.getValue()).intValue());
        Unit unit = Unit.f142422a;
        addView(c13254g, layoutParams);
        LinkedHashMap linkedHashMap = this.f123402a;
        Pair pairA = TuplesKt.a(Integer.valueOf(settings.e()), c13254g);
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
            java.util.LinkedHashMap r0 = r3.f123402a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.scandit.datacapture.barcode.internal.module.ui.popover.g r4 = (com.scandit.datacapture.barcode.internal.module.ui.popover.C13254g) r4
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
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.ui.popover.C13260m.a(int, boolean):boolean");
    }
}
