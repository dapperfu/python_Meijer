package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import hd.C14407h;
import hd.InterfaceC14408i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class zza extends Fragment implements InterfaceC14408i {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f64781b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final f f64782a = new f();

    public static zza a(Activity activity) {
        zza zzaVar;
        WeakHashMap weakHashMap = f64781b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzaVar = (zza) weakReference.get()) != null) {
            return zzaVar;
        }
        try {
            zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzaVar2));
            return zzaVar2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // hd.InterfaceC14408i
    public final void o(String str, C14407h c14407h) {
        this.f64782a.d(str, c14407h);
    }

    @Override // hd.InterfaceC14408i
    public final <T extends C14407h> T y(String str, Class<T> cls) {
        return (T) this.f64782a.c(str, cls);
    }

    @Override // hd.InterfaceC14408i
    public final Activity Q() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f64782a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f64782a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f64782a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f64782a.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f64782a.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f64782a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f64782a.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f64782a.l();
    }
}
