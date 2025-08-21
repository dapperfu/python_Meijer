package com.meijer.mobile.meijer.activity.scan;

import Co.ProductFullDetails;
import Ds.p;
import Nn.Q;
import Qj.m;
import Wd.a;
import Wd.e;
import Xd.b;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.Y;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import h.C14433g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import vs.ProductListDecorator;
import yk.C18326b;
import ys.C18372b;
import zn.c;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001iB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\u0005J#\u0010\u000f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\t2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010+J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u0010+J\u000f\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u0005R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010F\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b?\u0010@\u0012\u0004\bE\u0010\u0005\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010dR\u0014\u0010g\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\b¨\u0006j"}, d2 = {"Lcom/meijer/mobile/meijer/activity/scan/ScanActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lzn/c$a;", "LBj/b;", "<init>", "()V", "", "P1", "()Z", "", "T1", "L1", "", "", "permissions", "O1", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onDestroy", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "z0", "shouldMonitorConnectionStatus", "", "acceptedBarcodeTypes", "u", "(I)V", "", "LCo/h;", "scannedItems", "x", "(Ljava/util/List;)V", "barcode", "t0", "(Ljava/lang/String;)V", "Lvs/f;", "productItem", "isNewItem", "L", "(Lvs/f;Z)V", "A0", "errorMessage", "i0", "V", "b1", "LRo/c;", "s", "LRo/c;", "N1", "()LRo/c;", "setProductsRepository", "(LRo/c;)V", "productsRepository", "Lmv/K;", "t", "Lmv/K;", "M1", "()Lmv/K;", "setIoDispatcher", "(Lmv/K;)V", "getIoDispatcher$annotations", "ioDispatcher", "LFn/i;", "LFn/i;", "adapter", "LNn/Q;", "v", "LNn/Q;", "binding", "Lzn/c;", "w", "Lzn/c;", "scanItem", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "LXd/b;", "y", "LXd/b;", "barcodeDetector", "LWd/a;", "z", "LWd/a;", "cameraSource", "Lg/c;", "", "A", "Lg/c;", "permissionsResultLauncher", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "e1", "isCameraPermissionGranted", "B", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ScanActivity extends Hilt_ScanActivity implements c.a, Bj.b {

    /* renamed from: C, reason: collision with root package name */
    public static final int f112532C = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new c());

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Ro.c productsRepository;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public AbstractC15779K ioDispatcher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Fn.i adapter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Q binding;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private zn.c scanItem;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Xd.b barcodeDetector;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Wd.a cameraSource;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/meijer/mobile/meijer/activity/scan/ScanActivity$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.j(bottomSheet, "bottomSheet");
        }

        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.j(bottomSheet, "bottomSheet");
            if (newState == 4) {
                ScanActivity.this.L1();
                return;
            }
            Wd.a aVar = ScanActivity.this.cameraSource;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14275b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ScanActivity.this, ScanActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            ScanActivity.this.O1(p02);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity
    protected boolean shouldMonitorConnectionStatus() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void L1() {
        try {
            Wd.a aVar = this.cameraSource;
            if (aVar != null) {
                Q q10 = this.binding;
                if (q10 == null) {
                    Intrinsics.x("binding");
                    q10 = null;
                }
                aVar.b(q10.f21608C.getHolder());
            }
        } catch (IOException e10) {
            qw.a.INSTANCE.f(e10, "Camera source threw and IOException", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(Map<String, Boolean> permissions) {
        zn.c cVar = null;
        if (Intrinsics.e(permissions.get("android.permission.CAMERA"), Boolean.TRUE)) {
            zn.c cVar2 = this.scanItem;
            if (cVar2 == null) {
                Intrinsics.x("scanItem");
            } else {
                cVar = cVar2;
            }
            cVar.v0();
            return;
        }
        zn.c cVar3 = this.scanItem;
        if (cVar3 == null) {
            Intrinsics.x("scanItem");
        } else {
            cVar = cVar3;
        }
        cVar.u0();
    }

    private final boolean P1() {
        Fn.i iVar = this.adapter;
        if (iVar == null) {
            Intrinsics.x("adapter");
            iVar = null;
        }
        List<ProductListDecorator> listL = iVar.l();
        Intrinsics.i(listL, "getProducts(...)");
        return !listL.isEmpty();
    }

    private final void T1() {
        new c.a(this).setTitle(getString(Y.f100419F7)).setMessage(getString(Y.f100399E7)).setPositiveButton(getString(Y.f100905ee), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.scan.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ScanActivity.U1(this.f112546a, dialogInterface, i10);
            }
        }).setNegativeButton(getString(Y.f100885de), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.scan.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ScanActivity.V1(this.f112547a, dialogInterface, i10);
            }
        }).setNeutralButton(getString(Y.f100865ce), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.scan.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ScanActivity.W1(dialogInterface, i10);
            }
        }).setCancelable(false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(ScanActivity scanActivity, DialogInterface dialogInterface, int i10) {
        Fn.i iVar = scanActivity.adapter;
        if (iVar == null) {
            Intrinsics.x("adapter");
            iVar = null;
        }
        List<ProductListDecorator> listL = iVar.l();
        Intrinsics.i(listL, "getProducts(...)");
        List<ProductListDecorator> list = listL;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductListDecorator) it.next()).getProduct());
        }
        scanActivity.x(arrayList);
    }

    @Override // zn.c.a
    public void A0(String barcode) {
        Intrinsics.j(barcode, "barcode");
        Intent intent = getIntent();
        if (StringsKt.s0(barcode)) {
            setResult(0, intent);
        } else {
            intent.putExtra("barcode", barcode);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // zn.c.a
    public void L(ProductListDecorator productItem, boolean isNewItem) {
        Intrinsics.j(productItem, "productItem");
        Fn.i iVar = this.adapter;
        Q q10 = null;
        if (iVar == null) {
            Intrinsics.x("adapter");
            iVar = null;
        }
        iVar.m(productItem, isNewItem);
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.x("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(4);
        Q q11 = this.binding;
        if (q11 == null) {
            Intrinsics.x("binding");
        } else {
            q10 = q11;
        }
        q10.f21610E.scrollToPosition(0);
    }

    public final AbstractC15779K M1() {
        AbstractC15779K abstractC15779K = this.ioDispatcher;
        if (abstractC15779K != null) {
            return abstractC15779K;
        }
        Intrinsics.x("ioDispatcher");
        return null;
    }

    public final Ro.c N1() {
        Ro.c cVar = this.productsRepository;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.x("productsRepository");
        return null;
    }

    @Override // zn.c.a
    public void V() {
        qw.a.INSTANCE.d("PERMISSION DENIED.", new Object[0]);
        new m(this, C18372b.f172062m, new String[0]).B(Y.f101290y0).o(Y.f100621Q0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.scan.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ScanActivity.Q1(this.f112548a, dialogInterface, i10);
            }
        }).y().n().g();
    }

    @Override // zn.c.a
    public void b1() {
        Vibrator vibrator = (Vibrator) Z1.b.j(this, Vibrator.class);
        if (vibrator != null) {
            Lk.c.b(vibrator, 0L, 0, 3, null);
        }
    }

    @Override // zn.c.a
    public boolean e1() {
        return C18326b.a(this, "android.permission.CAMERA");
    }

    @Override // zn.c.a
    public void i0(String errorMessage) {
        Intrinsics.j(errorMessage, "errorMessage");
        Ds.m.a(this, errorMessage, new Object[0]);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        zn.c cVar = this.scanItem;
        if (cVar == null) {
            Intrinsics.x("scanItem");
            cVar = null;
        }
        cVar.P();
        super.onDestroy();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        if (item.getItemId() != 16908332 || !P1()) {
            return super.onOptionsItemSelected(item);
        }
        T1();
        return true;
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        Wd.a aVar = this.cameraSource;
        if (aVar != null) {
            aVar.c();
        }
        Wd.a aVar2 = this.cameraSource;
        if (aVar2 != null) {
            aVar2.a();
        }
        super.onPause();
    }

    @Override // zn.c.a
    public void t0(String barcode) {
        Intrinsics.j(barcode, "barcode");
        qw.a.INSTANCE.a("performSingleBarcodeScan barcode=%s", barcode);
        Intent intent = getIntent();
        intent.putExtra("barcode", barcode);
        setResult(-1, intent);
        finish();
    }

    @Override // zn.c.a
    public void u(int acceptedBarcodeTypes) {
        Xd.b bVarA = new b.a(getApplicationContext()).b(acceptedBarcodeTypes).a();
        this.barcodeDetector = bVarA;
        Xd.b bVar = null;
        if (bVarA == null) {
            Intrinsics.x("barcodeDetector");
            bVarA = null;
        }
        if (!bVarA.b()) {
            qw.a.INSTANCE.d("Barcode detector dependencies are not yet available...scanning will not work", new Object[0]);
            new Qj.j(this, C18372b.f172050a, new Object[0]).l().n().g();
            return;
        }
        Xd.b bVar2 = this.barcodeDetector;
        if (bVar2 == null) {
            Intrinsics.x("barcodeDetector");
            bVar2 = null;
        }
        zn.c cVar = this.scanItem;
        if (cVar == null) {
            Intrinsics.x("scanItem");
            cVar = null;
        }
        bVar2.e(new e.a(new com.meijer.mobile.meijer.activity.scan.b(cVar)).a());
        Xd.b bVar3 = this.barcodeDetector;
        if (bVar3 == null) {
            Intrinsics.x("barcodeDetector");
        } else {
            bVar = bVar3;
        }
        this.cameraSource = new a.C0879a(this, bVar).b(true).c(0).d(15.0f).a();
        L1();
    }

    @Override // zn.c.a
    public void x(List<ProductFullDetails> scannedItems) {
        Intrinsics.j(scannedItems, "scannedItems");
        List<ProductFullDetails> list = scannedItems;
        if (list.isEmpty()) {
            setResult(0);
        } else {
            Intent intent = getIntent();
            intent.putParcelableArrayListExtra("scanned_items", new ArrayList<>(list));
            setResult(-1, intent);
        }
        finish();
    }

    @Override // Bj.b
    public Toolbar y() {
        Q q10 = this.binding;
        if (q10 == null) {
            Intrinsics.x("binding");
            q10 = null;
        }
        MaterialToolbar appBar = q10.f21615z;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }

    @Override // zn.c.a
    public void z0() {
        this.permissionsResultLauncher.a(new String[]{"android.permission.CAMERA"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(ScanActivity scanActivity, DialogInterface dialogInterface, int i10) {
        scanActivity.startActivity(scanActivity.getMeijerIntent().b(scanActivity));
        scanActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R1(ScanActivity scanActivity, MenuItem menuItem) {
        if (menuItem.getItemId() == T.f99842W1) {
            zn.c cVar = scanActivity.scanItem;
            if (cVar == null) {
                Intrinsics.x("scanItem");
                cVar = null;
            }
            cVar.r0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S1(ScanActivity scanActivity) {
        if (!scanActivity.onNavigateUp()) {
            scanActivity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(ScanActivity scanActivity, DialogInterface dialogInterface, int i10) {
        scanActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        if (P1()) {
            T1();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.scanItem = new zn.c(getAppBackgroundManager(), N1(), getIntent().getBooleanExtra("allow_count_increment_mode", true), getIntent().getBooleanExtra("receipt_scanner", false), getIntent().getBooleanExtra("single_scan_mode", false), M1());
        Q qM0 = Q.M0(getLayoutInflater());
        this.binding = qM0;
        zn.c cVar = null;
        if (qM0 == null) {
            Intrinsics.x("binding");
            qM0 = null;
        }
        setContentView(Zr.a.j(qM0.getRoot(), false, 1, null));
        Q q10 = this.binding;
        if (q10 == null) {
            Intrinsics.x("binding");
            q10 = null;
        }
        Zr.a.c(q10.f21608C, false, 1, null);
        Q q11 = this.binding;
        if (q11 == null) {
            Intrinsics.x("binding");
            q11 = null;
        }
        zn.c cVar2 = this.scanItem;
        if (cVar2 == null) {
            Intrinsics.x("scanItem");
            cVar2 = null;
        }
        q11.O0(cVar2);
        Q q12 = this.binding;
        if (q12 == null) {
            Intrinsics.x("binding");
            q12 = null;
        }
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(q12.f21606A);
        zn.c cVar3 = this.scanItem;
        if (cVar3 == null) {
            Intrinsics.x("scanItem");
            cVar3 = null;
        }
        bottomSheetBehaviorQ0.P0(cVar3.p0());
        zn.c cVar4 = this.scanItem;
        if (cVar4 == null) {
            Intrinsics.x("scanItem");
            cVar4 = null;
        }
        bottomSheetBehaviorQ0.X0(cVar4.f0());
        bottomSheetBehaviorQ0.J0(new b());
        this.bottomSheetBehavior = bottomSheetBehaviorQ0;
        Q q13 = this.binding;
        if (q13 == null) {
            Intrinsics.x("binding");
            q13 = null;
        }
        q13.f21607B.setOnMenuItemClickListener(new Toolbar.h() { // from class: com.meijer.mobile.meijer.activity.scan.g
            @Override // androidx.appcompat.widget.Toolbar.h
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ScanActivity.R1(this.f112549a, menuItem);
            }
        });
        Fn.i iVar = new Fn.i();
        Q q14 = this.binding;
        if (q14 == null) {
            Intrinsics.x("binding");
            q14 = null;
        }
        q14.f21610E.setAdapter(iVar);
        this.adapter = iVar;
        Q q15 = this.binding;
        if (q15 == null) {
            Intrinsics.x("binding");
            q15 = null;
        }
        SurfaceHolder holder = q15.f21608C.getHolder();
        zn.c cVar5 = this.scanItem;
        if (cVar5 == null) {
            Intrinsics.x("scanItem");
        } else {
            cVar = cVar5;
        }
        holder.addCallback(cVar);
        p.d(getWindow());
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.scan.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanActivity.S1(this.f112550a);
            }
        }, 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        zn.c cVar = this.scanItem;
        if (cVar == null) {
            Intrinsics.x("scanItem");
            cVar = null;
        }
        cVar.Q();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        zn.c cVar = this.scanItem;
        if (cVar == null) {
            Intrinsics.x("scanItem");
            cVar = null;
        }
        cVar.O(this);
    }
}
