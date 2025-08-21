package fsimpl;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.frameworks.androidx.FSAndroidXFragment;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidComposeView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.util.Log;
import com.medallia.digital.mobilesdk.l3;
import io.constructor.data.local.PreferencesHelper;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: fsimpl.aw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14096aw {

    /* renamed from: c, reason: collision with root package name */
    private final bU f132974c;

    /* renamed from: d, reason: collision with root package name */
    private final aB f132975d;

    /* renamed from: f, reason: collision with root package name */
    private int f132977f;

    /* renamed from: g, reason: collision with root package name */
    private gh f132978g;

    /* renamed from: h, reason: collision with root package name */
    private C14082ai f132979h;

    /* renamed from: i, reason: collision with root package name */
    private final C14248u f132980i;

    /* renamed from: j, reason: collision with root package name */
    private final C14249v f132981j;

    /* renamed from: k, reason: collision with root package name */
    private final C14084ak f132982k;

    /* renamed from: l, reason: collision with root package name */
    private final WebViewTracker f132983l;

    /* renamed from: m, reason: collision with root package name */
    private final C14185ee f132984m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f132985n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f132986o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f132987p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC14101ba f132988q;

    /* renamed from: u, reason: collision with root package name */
    private C14095av f132992u;

    /* renamed from: v, reason: collision with root package name */
    private final fN f132993v;

    /* renamed from: w, reason: collision with root package name */
    private final C14138ck f132994w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC14120bt f132995x;

    /* renamed from: y, reason: collision with root package name */
    private View f132996y;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f132976e = new float[9];

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f132989r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final W f132990s = new W();

    /* renamed from: t, reason: collision with root package name */
    private final ByteArrayOutputStream f132991t = new ByteArrayOutputStream();

    /* renamed from: z, reason: collision with root package name */
    private RectF f132997z = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    List f132972a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    Set f132973b = new HashSet();

    public C14096aw(bU bUVar, aB aBVar, WebViewTracker webViewTracker, C14248u c14248u, C14249v c14249v, C14084ak c14084ak, C14185ee c14185ee, boolean z10, long j10, C14138ck c14138ck, AbstractC14120bt abstractC14120bt) {
        this.f132974c = bUVar;
        this.f132975d = aBVar;
        this.f132983l = webViewTracker;
        this.f132980i = c14248u;
        this.f132981j = c14249v;
        this.f132982k = c14084ak;
        this.f132984m = c14185ee;
        this.f132985n = z10;
        this.f132993v = new fN(z10, j10);
        this.f132994w = c14138ck;
        this.f132995x = abstractC14120bt;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce A[PHI: r1
      0x02ce: PHI (r1v28 android.graphics.RectF) = (r1v20 android.graphics.RectF), (r1v31 android.graphics.RectF), (r1v31 android.graphics.RectF) binds: [B:107:0x02cc, B:100:0x0274, B:102:0x0290] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(android.view.View r23, java.lang.Object r24, int r25, int r26, int r27, boolean r28, fsimpl.aK r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14096aw.a(android.view.View, java.lang.Object, int, int, int, boolean, fsimpl.aK, boolean):int");
    }

    private int a(View view, Object obj, int i10, RectF rectF) {
        a("scanClippedView");
        if (!this.f132986o) {
            return i10;
        }
        C14158dd.a(this.f132978g);
        C14158dd.b(this.f132978g, gd.c(obj));
        C14158dd.a(this.f132978g, gd.c(view));
        C14158dd.a(this.f132978g, (byte) 1);
        gh ghVar = this.f132978g;
        C14158dd.a(ghVar, C14172ds.a(ghVar, (int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        this.f132989r.add(Integer.valueOf(C14158dd.b(this.f132978g)));
        return a(view, obj, 0, i10, 0, this.f132981j.b(view), this.f132984m.a((Object) view), rectF.intersects(0.0f, 0.0f, view.getWidth(), view.getHeight()));
    }

    private int a(gh ghVar, View view, boolean z10) {
        this.f132972a.clear();
        if (view instanceof VideoView) {
            C14179dz.a(ghVar);
            C14179dz.a(ghVar, ((VideoView) view).isPlaying());
            this.f132972a.add(Integer.valueOf(dD.a(ghVar, (byte) 2, C14179dz.b(ghVar))));
        }
        if (!z10) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                int selectionStart = textView.getSelectionStart();
                int selectionEnd = textView.getSelectionEnd();
                if (selectionStart >= 0 && selectionEnd >= 0 && (selectionEnd > selectionStart || (textView.onCheckIsTextEditor() && textView.isCursorVisible() && textView.isFocused()))) {
                    dF.a(ghVar);
                    dF.a(ghVar, selectionStart);
                    dF.b(ghVar, selectionEnd);
                    this.f132972a.add(Integer.valueOf(dD.a(ghVar, (byte) 3, dF.b(ghVar))));
                }
                C14178dy.a(ghVar);
                C14178dy.a(ghVar, textView.onCheckIsTextEditor());
                this.f132972a.add(Integer.valueOf(dD.a(ghVar, (byte) 4, C14178dy.b(ghVar))));
            }
            if (view instanceof CompoundButton) {
                C14177dx.a(ghVar);
                C14177dx.a(ghVar, ((CompoundButton) view).isChecked());
                this.f132972a.add(Integer.valueOf(dD.a(ghVar, (byte) 1, C14177dx.b(ghVar))));
            }
        }
        return C14098ay.a(this.f132972a, ghVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final int i10, final int i11, final C14097ax c14097ax) {
        final C14097ax c14097ax2 = new C14097ax();
        Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(c14097ax2);
            }
        };
        this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(c14097ax2, i10, i11, c14097ax);
            }
        });
        this.f132993v.a(runnable);
    }

    private void a(View view, RectF rectF) {
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        if (scrollX == 0 && scrollY == 0) {
            return;
        }
        rectF.offset(scrollX, scrollY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, ViewGroup viewGroup, int[] iArr, RectF rectF, RectF rectF2, C14097ax c14097ax) {
        b(view, viewGroup, iArr[0], rectF, rectF2, c14097ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(View view, C14097ax c14097ax) {
        C14099az.a(this, (FSComposeAndroidComposeView) view, this.f132994w, c14097ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final View view, final Object obj, final int i10, RectF rectF, final RectF rectF2, final C14097ax c14097ax) {
        final RectF rectF3;
        a("scanViewAndChildren");
        if (!a(obj, view)) {
            c14097ax.f132998a = i10;
            return;
        }
        if (this.f132981j.a(view)) {
            c14097ax.f132998a = i10;
            return;
        }
        final aK aKVarA = this.f132984m.a((Object) view);
        final boolean zB = this.f132981j.b(view);
        final int[] iArr = new int[1];
        final int[] iArr2 = new int[1];
        final int i11 = (int) rectF.left;
        final int i12 = (int) rectF.top;
        final int i13 = (int) rectF.right;
        final int i14 = (int) rectF.bottom;
        final boolean zIntersects = rectF.intersects(0.0f, 0.0f, view.getWidth(), view.getHeight());
        this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(zB, obj, view, i11, i12, i13, i14, c14097ax, iArr, i10, iArr2, aKVarA, zIntersects);
            }
        });
        if (zB) {
            return;
        }
        iArr2[0] = this.f132992u.a(view, obj, this.f132981j, this.f132979h, this.f132990s, this.f132974c);
        if (C14124bx.a(view)) {
            final C14097ax c14097ax2 = new C14097ax();
            Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(view, c14097ax2);
                }
            };
            this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C14096aw.b(iArr, c14097ax2);
                }
            });
            this.f132993v.a(runnable);
            return;
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList = new ArrayList();
            final ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup instanceof FSDispatchDraw) {
                LinkedHashMap linkedHashMapA = this.f132979h.a();
                if (linkedHashMapA != null) {
                    for (Map.Entry entry : linkedHashMapA.entrySet()) {
                        arrayList.add(new Pair((View) entry.getKey(), (Rect) entry.getValue()));
                    }
                }
            } else {
                Rect rectL = this.f132979h.l();
                List listA = gc.a(viewGroup);
                if (listA != null) {
                    try {
                        Iterator it = listA.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Pair((View) it.next(), rectL));
                        }
                    } finally {
                        listA.clear();
                    }
                } else {
                    boolean zB2 = gc.b(viewGroup);
                    for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                        arrayList.add(new Pair(viewGroup.getChildAt(zB2 ? gc.a(viewGroup, viewGroup.getChildCount(), i15) : i15), rectL));
                    }
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                a(view, rectF);
            }
            for (int i16 = size - 1; i16 >= 0; i16--) {
                Pair pair = (Pair) arrayList.get(i16);
                final View view2 = (View) pair.first;
                Rect rect = (Rect) pair.second;
                if (rect == null) {
                    rectF3 = rectF;
                } else {
                    RectF rectF4 = new RectF(rect);
                    if (!rectF4.intersect(rectF)) {
                        rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    rectF3 = rectF4;
                }
                final C14097ax c14097ax3 = new C14097ax();
                Runnable runnable2 = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(view2, viewGroup, iArr, rectF3, rectF2, c14097ax3);
                    }
                };
                this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14096aw.a(iArr, c14097ax3);
                    }
                });
                this.f132993v.a(runnable2);
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, int[] iArr, RectF rectF, RectF[] rectFArr, C14097ax c14097ax) {
        c(view, (Object) null, iArr[0], rectF, rectFArr[0], c14097ax);
    }

    private void a(C14091ar c14091ar, final gh ghVar, InterfaceC14101ba interfaceC14101ba, final Context context, boolean z10, boolean z11, boolean z12, final int i10, final C14097ax c14097ax) {
        a("scanImpl");
        final DisplayMetrics displayMetricsA = fC.a();
        final int i11 = displayMetricsA.widthPixels;
        final int i12 = displayMetricsA.heightPixels;
        this.f132980i.a();
        this.f132992u = new C14095av(interfaceC14101ba, c14091ar);
        this.f132990s.a(z12);
        this.f132996y = null;
        this.f132997z = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jNanoTime = System.nanoTime();
        this.f132977f = 0;
        this.f132978g = ghVar;
        this.f132988q = interfaceC14101ba;
        this.f132979h = this.f132982k.a(interfaceC14101ba, this.f132984m, c14091ar);
        this.f132986o = z10;
        this.f132987p = z11;
        final C14097ax c14097ax2 = new C14097ax();
        Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(i11, i12, c14097ax2);
            }
        };
        this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(c14097ax2, ghVar, jCurrentTimeMillis, displayMetricsA, context, i10, i12, jNanoTime, c14097ax);
            }
        });
        this.f132993v.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final C14097ax c14097ax) {
        boolean z10;
        List list;
        final int[] iArr = new int[1];
        final RectF[] rectFArr = new RectF[1];
        List listA = this.f132975d.a();
        int size = listA.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                View viewFindFocus = ((View) listA.get(i10)).findFocus();
                if (viewFindFocus != null && this.f132981j.b(viewFindFocus)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f132979h.f();
        this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C14096aw.a(c14097ax, iArr);
            }
        });
        int i11 = 0;
        while (i11 < size) {
            final View view = (View) listA.get(i11);
            if (a(view) && !(z10 && C14147ct.a(view))) {
                final RectF rectF = new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                final C14097ax c14097ax2 = new C14097ax();
                list = listA;
                Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(view, iArr, rectF, rectFArr, c14097ax2);
                    }
                };
                this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(iArr, c14097ax2, view, rectF, rectFArr);
                    }
                });
                this.f132993v.a(runnable);
            } else {
                list = listA;
            }
            i11++;
            listA = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C14097ax c14097ax, int i10, int i11, C14097ax c14097ax2) {
        int i12 = c14097ax.f132998a;
        dE.a(this.f132978g);
        dE.a(this.f132978g, true);
        gh ghVar = this.f132978g;
        dE.a(ghVar, C14172ds.a(ghVar, 0, 0, i10, i11));
        int iB = dE.b(this.f132978g);
        if (this.f132986o) {
            C14158dd.a(this.f132978g);
            C14158dd.a(this.f132978g, 0L);
            C14158dd.b(this.f132978g, 0L);
            gh ghVar2 = this.f132978g;
            C14158dd.b(ghVar2, ghVar2.a());
            C14158dd.c(this.f132978g, this.f132977f);
            this.f132989r.add(Integer.valueOf(C14158dd.b(this.f132978g)));
        }
        dA.a(this.f132978g);
        dA.a(this.f132978g, iB);
        dA.c(this.f132978g, i12);
        c14097ax2.f132998a = dA.b(this.f132978g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C14097ax c14097ax, gh ghVar, long j10, DisplayMetrics displayMetrics, Context context, int i10, int i11, long j11, C14097ax c14097ax2) {
        try {
            int i12 = c14097ax.f132998a;
            dB.a(ghVar);
            dB.a(ghVar, j10);
            dB.b(ghVar, displayMetrics.densityDpi);
            dB.d(ghVar, i12);
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            int i13 = displayMetrics2.widthPixels;
            if (i10 != 0) {
                i11 = displayMetrics2.heightPixels - i10;
            }
            dB.c(ghVar, C14172ds.a(ghVar, 0, 0, i13, i11));
            dB.a(ghVar, (int) (System.nanoTime() - j11));
            this.f132978g = null;
            this.f132988q = null;
            this.f132992u = null;
            this.f132982k.a(this.f132979h);
            this.f132979h = null;
            this.f132990s.a();
            this.f132983l.b();
            c14097ax2.f132998a = dB.b(ghVar);
        } catch (Throwable th2) {
            this.f132978g = null;
            this.f132988q = null;
            this.f132992u = null;
            this.f132982k.a(this.f132979h);
            this.f132979h = null;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C14097ax c14097ax, int[] iArr) {
        c14097ax.f132998a = iArr[0];
    }

    private static void a(gh ghVar, View view, boolean z10, C14252y c14252y) {
        int i10 = z10 ? 256 : 0;
        if (c14252y != null && c14252y.a()) {
            i10 |= 32768;
        }
        if (view.isClickable()) {
            i10 |= 1;
        }
        if (view.isEnabled()) {
            i10 |= 2;
        }
        if (view.isFocusable()) {
            i10 |= 4;
        }
        if (view.isFocused()) {
            i10 |= 8;
        }
        if (view.isPressed()) {
            i10 |= 16;
        }
        if (view.isSelected()) {
            i10 |= 32;
        }
        if (view.isActivated()) {
            i10 |= 64;
        }
        if (view.isHovered()) {
            i10 |= 128;
        }
        if (view.isOpaque()) {
            i10 |= 512;
        }
        if (view.isHardwareAccelerated()) {
            i10 |= 1024;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getClipChildren()) {
                i10 |= RecyclerView.m.FLAG_MOVED;
            }
            if (viewGroup.getClipToPadding()) {
                i10 |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }
        if (view instanceof WebView) {
            i10 |= 8192;
        }
        dE.h(ghVar, i10);
    }

    static void a(gh ghVar, View view, boolean z10, boolean z11, boolean z12, C14252y c14252y) {
        a(ghVar, view, z10, c14252y);
        C14098ay.a(ghVar, z11, z12);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        while ((i10 & (-128)) != 0) {
            byteArrayOutputStream.write((byte) ((i10 & l3.f93324d) | 128));
            i10 >>>= 7;
        }
        byteArrayOutputStream.write((byte) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Object obj, View view, int i10, int i11, int i12, int i13, C14097ax c14097ax, int[] iArr, int i14, int[] iArr2, aK aKVar, boolean z11) {
        if (!z10 && this.f132986o) {
            C14158dd.a(this.f132978g);
            C14158dd.b(this.f132978g, obj == null ? 0L : gd.c(obj));
            C14158dd.a(this.f132978g, gd.c(view));
            C14158dd.a(this.f132978g, Byte.MIN_VALUE);
            gh ghVar = this.f132978g;
            C14158dd.a(ghVar, C14172ds.a(ghVar, i10, i11, i12, i13));
            this.f132989r.add(Integer.valueOf(C14158dd.b(this.f132978g)));
        }
        c14097ax.f132998a = a(view, obj, iArr[0], i14, iArr2[0], z10, aKVar, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int[] iArr, C14097ax c14097ax) {
        iArr[0] = c14097ax.f132998a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int[] iArr, C14097ax c14097ax, View view, RectF rectF, RectF[] rectFArr) {
        iArr[0] = c14097ax.f132998a;
        view.getLocationOnScreen(new int[2]);
        rectF.offset(r3[0], r3[1]);
        Window windowA = this.f132975d.a(view);
        if (windowA == null || !windowA.isFloating()) {
            return;
        }
        RectF rectF2 = rectFArr[0];
        if (rectF2 == null) {
            rectFArr[0] = rectF;
        } else if (rectF.contains(rectF2)) {
            rectFArr[0].union(rectF);
        }
    }

    private boolean a(View view) {
        boolean z10 = view.getVisibility() == 0;
        boolean z11 = view.getWidth() > 0 && view.getHeight() > 0;
        if (!z11) {
            z11 = !a((Object) view);
        }
        return z10 && z11 && !C14118br.b(view);
    }

    private static boolean a(Object obj) {
        if (obj instanceof ViewGroup) {
            return ((ViewGroup) obj).getClipChildren();
        }
        return true;
    }

    private boolean a(Object obj, View view) {
        if (this.f132973b.contains(view)) {
            return false;
        }
        if (!this.f132985n) {
            return true;
        }
        if (view.isAttachedToWindow()) {
            return !(obj instanceof View) || view.getParent() == obj;
        }
        return false;
    }

    private void b(final View view, final Object obj, final int i10, RectF rectF, RectF rectF2, final C14097ax c14097ax) {
        final RectF rectF3;
        boolean z10;
        int iA;
        a("scanChild");
        if (!a(obj, view)) {
            c14097ax.f132998a = i10;
            return;
        }
        boolean z11 = false;
        final RectF rectF4 = null;
        if (a(view)) {
            RectF rectF5 = new RectF(rectF);
            float f10 = -view.getLeft();
            float f11 = -view.getTop();
            rectF5.offset(f10, f11);
            Matrix matrix = view.getMatrix();
            if (matrix.invert(matrix)) {
                matrix.mapRect(rectF5);
            }
            if (rectF2 == null) {
                rectF4 = rectF2;
            } else if (matrix.rectStaysRect()) {
                rectF4 = new RectF(rectF2);
                rectF4.offset(f10, f11);
                matrix.mapRect(rectF4);
            }
            if (this.f132987p) {
                if (rectF5.height() > 0.0f && rectF5.width() > 0.0f) {
                    z11 = true;
                }
                if (z11 && (a(obj) || b(view))) {
                    boolean zIntersects = rectF5.intersects(0.0f, 0.0f, view.getWidth(), view.getHeight());
                    if (rectF4 != null) {
                        zIntersects &= !rectF4.contains(0.0f, 0.0f, r0, r5);
                    }
                    z11 = zIntersects;
                }
            } else {
                z11 = true;
            }
            z10 = z11;
            rectF3 = rectF5;
        } else {
            rectF3 = null;
            rectF4 = rectF2;
            z10 = false;
        }
        if (rectF3 == null) {
            iA = i10;
        } else {
            if (z10) {
                this.f132993v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(view, obj, i10, rectF3, rectF4, c14097ax);
                    }
                });
                return;
            }
            iA = a(view, obj, i10, rectF3);
        }
        c14097ax.f132998a = iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(C14091ar c14091ar, gh ghVar, InterfaceC14101ba interfaceC14101ba, Context context, boolean z10, boolean z11, boolean z12, int i10, C14097ax c14097ax) {
        k();
        a(c14091ar, ghVar, interfaceC14101ba, context, z10, z11, z12, i10, c14097ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(int[] iArr, C14097ax c14097ax) {
        iArr[0] = c14097ax.f132998a;
    }

    private static boolean b(Object obj) {
        if (!(obj instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) obj;
        if (viewGroup.getClipToPadding()) {
            return (viewGroup.getPaddingLeft() == 0 && viewGroup.getPaddingTop() == 0 && viewGroup.getPaddingRight() == 0 && viewGroup.getPaddingBottom() == 0) ? false : true;
        }
        return false;
    }

    private void k() {
        int i_fsGetState;
        ViewGroup viewGroup_fsGetContainer;
        if (this.f132994w.E()) {
            this.f132973b.clear();
            boolean z10 = true;
            int i_fsGetStartedValue = -1;
            int i_fsGetResumedValue = -1;
            for (FSAndroidXFragment fSAndroidXFragment : this.f132995x.b()) {
                if (fSAndroidXFragment != null && (i_fsGetState = fSAndroidXFragment._fsGetState()) != -1) {
                    if (z10) {
                        i_fsGetStartedValue = fSAndroidXFragment._fsGetStartedValue();
                        i_fsGetResumedValue = fSAndroidXFragment._fsGetResumedValue();
                        z10 = false;
                    }
                    if (i_fsGetState != i_fsGetStartedValue && i_fsGetState != i_fsGetResumedValue && (viewGroup_fsGetContainer = fSAndroidXFragment._fsGetContainer()) != null) {
                        this.f132973b.add(viewGroup_fsGetContainer);
                    }
                }
            }
        }
    }

    public int a(aK aKVar) {
        this.f132991t.reset();
        int iA = this.f132988q.a(aKVar.f132736b);
        if (iA != 0) {
            a(this.f132991t, this.f132988q.a(PreferencesHelper.PREF_ID));
            a(this.f132991t, iA);
        }
        int iA2 = this.f132988q.a(aKVar.f132735a);
        if (iA2 != 0) {
            a(this.f132991t, this.f132988q.a("tagName"));
            a(this.f132991t, iA2);
        }
        List<String> list = aKVar.f132737c;
        if (list != null && !list.isEmpty()) {
            int iA3 = this.f132988q.a("className");
            for (String str : list) {
                a(this.f132991t, iA3);
                a(this.f132991t, this.f132988q.a(str));
            }
        }
        Map map = aKVar.f132738d;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                a(this.f132991t, this.f132988q.a((String) entry.getKey()));
                a(this.f132991t, this.f132988q.a((String) entry.getValue()));
            }
        }
        if (this.f132991t.size() > 0) {
            return dE.a(this.f132978g, this.f132991t.toByteArray());
        }
        return 0;
    }

    public int a(final C14091ar c14091ar, final gh ghVar, final InterfaceC14101ba interfaceC14101ba, final Context context, final boolean z10, final boolean z11, final boolean z12, final int i10, Throwable[] thArr, long[] jArr) throws InterruptedException {
        C14228fu.b("'scan' MUST NOT be run on the UI thread.", new Object[0]);
        final C14097ax c14097ax = new C14097ax();
        fQ fQVarB = this.f132993v.b(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(c14091ar, ghVar, interfaceC14101ba, context, z10, z11, z12, i10, c14097ax);
            }
        });
        jArr[0] = fQVarB.f133486b;
        if (fQVarB.f133485a != null) {
            Log.e("Unexpected exception in scan", fQVarB.f133485a);
            thArr[0] = fQVarB.f133485a;
            c14097ax.f132998a = -1;
        }
        this.f132973b.clear();
        return c14097ax.f132998a;
    }

    public int a(gh ghVar) {
        if (this.f132989r.size() == 0) {
            return 0;
        }
        C14173dt.f(ghVar, this.f132989r.size());
        for (int i10 = 0; i10 < this.f132989r.size(); i10++) {
            ghVar.d(((Integer) this.f132989r.get(i10)).intValue());
        }
        int iB = ghVar.b();
        this.f132989r.clear();
        return iB;
    }

    fN a() {
        return this.f132993v;
    }

    public void a(FSComposeLayoutNode fSComposeLayoutNode, View view, int i10, Rect rect, C14097ax c14097ax) {
        b(view, fSComposeLayoutNode, i10, new RectF(rect), null, c14097ax);
    }

    void a(String str) {
        if (C14228fu.f133537a) {
            C14228fu.a("'" + str + "' MUST be run on the UI thread.", new Object[0]);
        }
    }

    boolean a(FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2) {
        if (!this.f132985n) {
            return true;
        }
        if (fSComposeLayoutNode2._fsIsAttached() && !fSComposeLayoutNode2._fsIsDeactivated() && fSComposeLayoutNode2._fsGetParent() == fSComposeLayoutNode) {
            return fSComposeLayoutNode != null || fSComposeLayoutNode2._fsGetOwner() == fSComposeAndroidComposeView;
        }
        return false;
    }

    C14248u b() {
        return this.f132980i;
    }

    C14249v c() {
        return this.f132981j;
    }

    gh d() {
        return this.f132978g;
    }

    C14185ee e() {
        return this.f132984m;
    }

    C14095av f() {
        return this.f132992u;
    }

    C14082ai g() {
        return this.f132979h;
    }

    InterfaceC14101ba h() {
        return this.f132988q;
    }

    void i() {
        this.f132977f++;
    }

    public long j() {
        View view = this.f132996y;
        if (view == null) {
            return 0L;
        }
        return gd.c(view);
    }
}
