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
/* loaded from: classes14.dex */
public class C13971aw {

    /* renamed from: c, reason: collision with root package name */
    private final bU f131724c;

    /* renamed from: d, reason: collision with root package name */
    private final aB f131725d;

    /* renamed from: f, reason: collision with root package name */
    private int f131727f;

    /* renamed from: g, reason: collision with root package name */
    private gh f131728g;

    /* renamed from: h, reason: collision with root package name */
    private C13957ai f131729h;

    /* renamed from: i, reason: collision with root package name */
    private final C14123u f131730i;

    /* renamed from: j, reason: collision with root package name */
    private final C14124v f131731j;

    /* renamed from: k, reason: collision with root package name */
    private final C13959ak f131732k;

    /* renamed from: l, reason: collision with root package name */
    private final WebViewTracker f131733l;

    /* renamed from: m, reason: collision with root package name */
    private final C14060ee f131734m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f131735n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f131736o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f131737p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC13976ba f131738q;

    /* renamed from: u, reason: collision with root package name */
    private C13970av f131742u;

    /* renamed from: v, reason: collision with root package name */
    private final fN f131743v;

    /* renamed from: w, reason: collision with root package name */
    private final C14013ck f131744w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC13995bt f131745x;

    /* renamed from: y, reason: collision with root package name */
    private View f131746y;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f131726e = new float[9];

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f131739r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final W f131740s = new W();

    /* renamed from: t, reason: collision with root package name */
    private final ByteArrayOutputStream f131741t = new ByteArrayOutputStream();

    /* renamed from: z, reason: collision with root package name */
    private RectF f131747z = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    List f131722a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    Set f131723b = new HashSet();

    public C13971aw(bU bUVar, aB aBVar, WebViewTracker webViewTracker, C14123u c14123u, C14124v c14124v, C13959ak c13959ak, C14060ee c14060ee, boolean z10, long j10, C14013ck c14013ck, AbstractC13995bt abstractC13995bt) {
        this.f131724c = bUVar;
        this.f131725d = aBVar;
        this.f131733l = webViewTracker;
        this.f131730i = c14123u;
        this.f131731j = c14124v;
        this.f131732k = c13959ak;
        this.f131734m = c14060ee;
        this.f131735n = z10;
        this.f131743v = new fN(z10, j10);
        this.f131744w = c14013ck;
        this.f131745x = abstractC13995bt;
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
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C13971aw.a(android.view.View, java.lang.Object, int, int, int, boolean, fsimpl.aK, boolean):int");
    }

    private int a(View view, Object obj, int i10, RectF rectF) {
        a("scanClippedView");
        if (!this.f131736o) {
            return i10;
        }
        C14033dd.a(this.f131728g);
        C14033dd.b(this.f131728g, gd.c(obj));
        C14033dd.a(this.f131728g, gd.c(view));
        C14033dd.a(this.f131728g, (byte) 1);
        gh ghVar = this.f131728g;
        C14033dd.a(ghVar, C14047ds.a(ghVar, (int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        this.f131739r.add(Integer.valueOf(C14033dd.b(this.f131728g)));
        return a(view, obj, 0, i10, 0, this.f131731j.b(view), this.f131734m.a((Object) view), rectF.intersects(0.0f, 0.0f, view.getWidth(), view.getHeight()));
    }

    private int a(gh ghVar, View view, boolean z10) {
        this.f131722a.clear();
        if (view instanceof VideoView) {
            C14054dz.a(ghVar);
            C14054dz.a(ghVar, ((VideoView) view).isPlaying());
            this.f131722a.add(Integer.valueOf(dD.a(ghVar, (byte) 2, C14054dz.b(ghVar))));
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
                    this.f131722a.add(Integer.valueOf(dD.a(ghVar, (byte) 3, dF.b(ghVar))));
                }
                C14053dy.a(ghVar);
                C14053dy.a(ghVar, textView.onCheckIsTextEditor());
                this.f131722a.add(Integer.valueOf(dD.a(ghVar, (byte) 4, C14053dy.b(ghVar))));
            }
            if (view instanceof CompoundButton) {
                C14052dx.a(ghVar);
                C14052dx.a(ghVar, ((CompoundButton) view).isChecked());
                this.f131722a.add(Integer.valueOf(dD.a(ghVar, (byte) 1, C14052dx.b(ghVar))));
            }
        }
        return C13973ay.a(this.f131722a, ghVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final int i10, final int i11, final C13972ax c13972ax) {
        final C13972ax c13972ax2 = new C13972ax();
        Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(c13972ax2);
            }
        };
        this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(c13972ax2, i10, i11, c13972ax);
            }
        });
        this.f131743v.a(runnable);
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
    public /* synthetic */ void a(View view, ViewGroup viewGroup, int[] iArr, RectF rectF, RectF rectF2, C13972ax c13972ax) {
        b(view, viewGroup, iArr[0], rectF, rectF2, c13972ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(View view, C13972ax c13972ax) {
        C13974az.a(this, (FSComposeAndroidComposeView) view, this.f131744w, c13972ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final View view, final Object obj, final int i10, RectF rectF, final RectF rectF2, final C13972ax c13972ax) {
        final RectF rectF3;
        a("scanViewAndChildren");
        if (!a(obj, view)) {
            c13972ax.f131748a = i10;
            return;
        }
        if (this.f131731j.a(view)) {
            c13972ax.f131748a = i10;
            return;
        }
        final aK aKVarA = this.f131734m.a((Object) view);
        final boolean zB = this.f131731j.b(view);
        final int[] iArr = new int[1];
        final int[] iArr2 = new int[1];
        final int i11 = (int) rectF.left;
        final int i12 = (int) rectF.top;
        final int i13 = (int) rectF.right;
        final int i14 = (int) rectF.bottom;
        final boolean zIntersects = rectF.intersects(0.0f, 0.0f, view.getWidth(), view.getHeight());
        this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(zB, obj, view, i11, i12, i13, i14, c13972ax, iArr, i10, iArr2, aKVarA, zIntersects);
            }
        });
        if (zB) {
            return;
        }
        iArr2[0] = this.f131742u.a(view, obj, this.f131731j, this.f131729h, this.f131740s, this.f131724c);
        if (C13999bx.a(view)) {
            final C13972ax c13972ax2 = new C13972ax();
            Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(view, c13972ax2);
                }
            };
            this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C13971aw.b(iArr, c13972ax2);
                }
            });
            this.f131743v.a(runnable);
            return;
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList = new ArrayList();
            final ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup instanceof FSDispatchDraw) {
                LinkedHashMap linkedHashMapA = this.f131729h.a();
                if (linkedHashMapA != null) {
                    for (Map.Entry entry : linkedHashMapA.entrySet()) {
                        arrayList.add(new Pair((View) entry.getKey(), (Rect) entry.getValue()));
                    }
                }
            } else {
                Rect rectL = this.f131729h.l();
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
                final C13972ax c13972ax3 = new C13972ax();
                Runnable runnable2 = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(view2, viewGroup, iArr, rectF3, rectF2, c13972ax3);
                    }
                };
                this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13971aw.a(iArr, c13972ax3);
                    }
                });
                this.f131743v.a(runnable2);
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, int[] iArr, RectF rectF, RectF[] rectFArr, C13972ax c13972ax) {
        c(view, (Object) null, iArr[0], rectF, rectFArr[0], c13972ax);
    }

    private void a(C13966ar c13966ar, final gh ghVar, InterfaceC13976ba interfaceC13976ba, final Context context, boolean z10, boolean z11, boolean z12, final int i10, final C13972ax c13972ax) {
        a("scanImpl");
        final DisplayMetrics displayMetricsA = fC.a();
        final int i11 = displayMetricsA.widthPixels;
        final int i12 = displayMetricsA.heightPixels;
        this.f131730i.a();
        this.f131742u = new C13970av(interfaceC13976ba, c13966ar);
        this.f131740s.a(z12);
        this.f131746y = null;
        this.f131747z = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jNanoTime = System.nanoTime();
        this.f131727f = 0;
        this.f131728g = ghVar;
        this.f131738q = interfaceC13976ba;
        this.f131729h = this.f131732k.a(interfaceC13976ba, this.f131734m, c13966ar);
        this.f131736o = z10;
        this.f131737p = z11;
        final C13972ax c13972ax2 = new C13972ax();
        Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(i11, i12, c13972ax2);
            }
        };
        this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(c13972ax2, ghVar, jCurrentTimeMillis, displayMetricsA, context, i10, i12, jNanoTime, c13972ax);
            }
        });
        this.f131743v.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final C13972ax c13972ax) {
        boolean z10;
        List list;
        final int[] iArr = new int[1];
        final RectF[] rectFArr = new RectF[1];
        List listA = this.f131725d.a();
        int size = listA.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                View viewFindFocus = ((View) listA.get(i10)).findFocus();
                if (viewFindFocus != null && this.f131731j.b(viewFindFocus)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f131729h.f();
        this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C13971aw.a(c13972ax, iArr);
            }
        });
        int i11 = 0;
        while (i11 < size) {
            final View view = (View) listA.get(i11);
            if (a(view) && !(z10 && C14022ct.a(view))) {
                final RectF rectF = new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                final C13972ax c13972ax2 = new C13972ax();
                list = listA;
                Runnable runnable = new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(view, iArr, rectF, rectFArr, c13972ax2);
                    }
                };
                this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(iArr, c13972ax2, view, rectF, rectFArr);
                    }
                });
                this.f131743v.a(runnable);
            } else {
                list = listA;
            }
            i11++;
            listA = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C13972ax c13972ax, int i10, int i11, C13972ax c13972ax2) {
        int i12 = c13972ax.f131748a;
        dE.a(this.f131728g);
        dE.a(this.f131728g, true);
        gh ghVar = this.f131728g;
        dE.a(ghVar, C14047ds.a(ghVar, 0, 0, i10, i11));
        int iB = dE.b(this.f131728g);
        if (this.f131736o) {
            C14033dd.a(this.f131728g);
            C14033dd.a(this.f131728g, 0L);
            C14033dd.b(this.f131728g, 0L);
            gh ghVar2 = this.f131728g;
            C14033dd.b(ghVar2, ghVar2.a());
            C14033dd.c(this.f131728g, this.f131727f);
            this.f131739r.add(Integer.valueOf(C14033dd.b(this.f131728g)));
        }
        dA.a(this.f131728g);
        dA.a(this.f131728g, iB);
        dA.c(this.f131728g, i12);
        c13972ax2.f131748a = dA.b(this.f131728g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C13972ax c13972ax, gh ghVar, long j10, DisplayMetrics displayMetrics, Context context, int i10, int i11, long j11, C13972ax c13972ax2) {
        try {
            int i12 = c13972ax.f131748a;
            dB.a(ghVar);
            dB.a(ghVar, j10);
            dB.b(ghVar, displayMetrics.densityDpi);
            dB.d(ghVar, i12);
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            int i13 = displayMetrics2.widthPixels;
            if (i10 != 0) {
                i11 = displayMetrics2.heightPixels - i10;
            }
            dB.c(ghVar, C14047ds.a(ghVar, 0, 0, i13, i11));
            dB.a(ghVar, (int) (System.nanoTime() - j11));
            this.f131728g = null;
            this.f131738q = null;
            this.f131742u = null;
            this.f131732k.a(this.f131729h);
            this.f131729h = null;
            this.f131740s.a();
            this.f131733l.b();
            c13972ax2.f131748a = dB.b(ghVar);
        } catch (Throwable th2) {
            this.f131728g = null;
            this.f131738q = null;
            this.f131742u = null;
            this.f131732k.a(this.f131729h);
            this.f131729h = null;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C13972ax c13972ax, int[] iArr) {
        c13972ax.f131748a = iArr[0];
    }

    private static void a(gh ghVar, View view, boolean z10, C14127y c14127y) {
        int i10 = z10 ? 256 : 0;
        if (c14127y != null && c14127y.a()) {
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

    static void a(gh ghVar, View view, boolean z10, boolean z11, boolean z12, C14127y c14127y) {
        a(ghVar, view, z10, c14127y);
        C13973ay.a(ghVar, z11, z12);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        while ((i10 & (-128)) != 0) {
            byteArrayOutputStream.write((byte) ((i10 & l3.f92485d) | 128));
            i10 >>>= 7;
        }
        byteArrayOutputStream.write((byte) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Object obj, View view, int i10, int i11, int i12, int i13, C13972ax c13972ax, int[] iArr, int i14, int[] iArr2, aK aKVar, boolean z11) {
        if (!z10 && this.f131736o) {
            C14033dd.a(this.f131728g);
            C14033dd.b(this.f131728g, obj == null ? 0L : gd.c(obj));
            C14033dd.a(this.f131728g, gd.c(view));
            C14033dd.a(this.f131728g, Byte.MIN_VALUE);
            gh ghVar = this.f131728g;
            C14033dd.a(ghVar, C14047ds.a(ghVar, i10, i11, i12, i13));
            this.f131739r.add(Integer.valueOf(C14033dd.b(this.f131728g)));
        }
        c13972ax.f131748a = a(view, obj, iArr[0], i14, iArr2[0], z10, aKVar, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int[] iArr, C13972ax c13972ax) {
        iArr[0] = c13972ax.f131748a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int[] iArr, C13972ax c13972ax, View view, RectF rectF, RectF[] rectFArr) {
        iArr[0] = c13972ax.f131748a;
        view.getLocationOnScreen(new int[2]);
        rectF.offset(r3[0], r3[1]);
        Window windowA = this.f131725d.a(view);
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
        return z10 && z11 && !C13993br.b(view);
    }

    private static boolean a(Object obj) {
        if (obj instanceof ViewGroup) {
            return ((ViewGroup) obj).getClipChildren();
        }
        return true;
    }

    private boolean a(Object obj, View view) {
        if (this.f131723b.contains(view)) {
            return false;
        }
        if (!this.f131735n) {
            return true;
        }
        if (view.isAttachedToWindow()) {
            return !(obj instanceof View) || view.getParent() == obj;
        }
        return false;
    }

    private void b(final View view, final Object obj, final int i10, RectF rectF, RectF rectF2, final C13972ax c13972ax) {
        final RectF rectF3;
        boolean z10;
        int iA;
        a("scanChild");
        if (!a(obj, view)) {
            c13972ax.f131748a = i10;
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
            if (this.f131737p) {
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
                this.f131743v.a(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(view, obj, i10, rectF3, rectF4, c13972ax);
                    }
                });
                return;
            }
            iA = a(view, obj, i10, rectF3);
        }
        c13972ax.f131748a = iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(C13966ar c13966ar, gh ghVar, InterfaceC13976ba interfaceC13976ba, Context context, boolean z10, boolean z11, boolean z12, int i10, C13972ax c13972ax) {
        k();
        a(c13966ar, ghVar, interfaceC13976ba, context, z10, z11, z12, i10, c13972ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(int[] iArr, C13972ax c13972ax) {
        iArr[0] = c13972ax.f131748a;
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
        if (this.f131744w.E()) {
            this.f131723b.clear();
            boolean z10 = true;
            int i_fsGetStartedValue = -1;
            int i_fsGetResumedValue = -1;
            for (FSAndroidXFragment fSAndroidXFragment : this.f131745x.b()) {
                if (fSAndroidXFragment != null && (i_fsGetState = fSAndroidXFragment._fsGetState()) != -1) {
                    if (z10) {
                        i_fsGetStartedValue = fSAndroidXFragment._fsGetStartedValue();
                        i_fsGetResumedValue = fSAndroidXFragment._fsGetResumedValue();
                        z10 = false;
                    }
                    if (i_fsGetState != i_fsGetStartedValue && i_fsGetState != i_fsGetResumedValue && (viewGroup_fsGetContainer = fSAndroidXFragment._fsGetContainer()) != null) {
                        this.f131723b.add(viewGroup_fsGetContainer);
                    }
                }
            }
        }
    }

    public int a(aK aKVar) {
        this.f131741t.reset();
        int iA = this.f131738q.a(aKVar.f131486b);
        if (iA != 0) {
            a(this.f131741t, this.f131738q.a(PreferencesHelper.PREF_ID));
            a(this.f131741t, iA);
        }
        int iA2 = this.f131738q.a(aKVar.f131485a);
        if (iA2 != 0) {
            a(this.f131741t, this.f131738q.a("tagName"));
            a(this.f131741t, iA2);
        }
        List<String> list = aKVar.f131487c;
        if (list != null && !list.isEmpty()) {
            int iA3 = this.f131738q.a("className");
            for (String str : list) {
                a(this.f131741t, iA3);
                a(this.f131741t, this.f131738q.a(str));
            }
        }
        Map map = aKVar.f131488d;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                a(this.f131741t, this.f131738q.a((String) entry.getKey()));
                a(this.f131741t, this.f131738q.a((String) entry.getValue()));
            }
        }
        if (this.f131741t.size() > 0) {
            return dE.a(this.f131728g, this.f131741t.toByteArray());
        }
        return 0;
    }

    public int a(final C13966ar c13966ar, final gh ghVar, final InterfaceC13976ba interfaceC13976ba, final Context context, final boolean z10, final boolean z11, final boolean z12, final int i10, Throwable[] thArr, long[] jArr) throws InterruptedException {
        C14103fu.b("'scan' MUST NOT be run on the UI thread.", new Object[0]);
        final C13972ax c13972ax = new C13972ax();
        fQ fQVarB = this.f131743v.b(new Runnable() { // from class: fsimpl.aw$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(c13966ar, ghVar, interfaceC13976ba, context, z10, z11, z12, i10, c13972ax);
            }
        });
        jArr[0] = fQVarB.f132236b;
        if (fQVarB.f132235a != null) {
            Log.e("Unexpected exception in scan", fQVarB.f132235a);
            thArr[0] = fQVarB.f132235a;
            c13972ax.f131748a = -1;
        }
        this.f131723b.clear();
        return c13972ax.f131748a;
    }

    public int a(gh ghVar) {
        if (this.f131739r.size() == 0) {
            return 0;
        }
        C14048dt.f(ghVar, this.f131739r.size());
        for (int i10 = 0; i10 < this.f131739r.size(); i10++) {
            ghVar.d(((Integer) this.f131739r.get(i10)).intValue());
        }
        int iB = ghVar.b();
        this.f131739r.clear();
        return iB;
    }

    fN a() {
        return this.f131743v;
    }

    public void a(FSComposeLayoutNode fSComposeLayoutNode, View view, int i10, Rect rect, C13972ax c13972ax) {
        b(view, fSComposeLayoutNode, i10, new RectF(rect), null, c13972ax);
    }

    void a(String str) {
        if (C14103fu.f132287a) {
            C14103fu.a("'" + str + "' MUST be run on the UI thread.", new Object[0]);
        }
    }

    boolean a(FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2) {
        if (!this.f131735n) {
            return true;
        }
        if (fSComposeLayoutNode2._fsIsAttached() && !fSComposeLayoutNode2._fsIsDeactivated() && fSComposeLayoutNode2._fsGetParent() == fSComposeLayoutNode) {
            return fSComposeLayoutNode != null || fSComposeLayoutNode2._fsGetOwner() == fSComposeAndroidComposeView;
        }
        return false;
    }

    C14123u b() {
        return this.f131730i;
    }

    C14124v c() {
        return this.f131731j;
    }

    gh d() {
        return this.f131728g;
    }

    C14060ee e() {
        return this.f131734m;
    }

    C13970av f() {
        return this.f131742u;
    }

    C13957ai g() {
        return this.f131729h;
    }

    InterfaceC13976ba h() {
        return this.f131738q;
    }

    void i() {
        this.f131727f++;
    }

    public long j() {
        View view = this.f131746y;
        if (view == null) {
            return 0L;
        }
        return gd.c(view);
    }
}
