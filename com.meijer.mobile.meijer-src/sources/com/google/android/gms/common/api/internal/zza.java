package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import jd.C14985h;
import jd.InterfaceC14986i;

/* loaded from: classes4.dex */
public final class zza extends Fragment implements InterfaceC14986i {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f65621b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final f f65622a = new f();

    public static zza a(Activity activity) {
        zza zzaVar;
        WeakHashMap weakHashMap = f65621b;
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

    @Override // jd.InterfaceC14986i
    public final <T extends C14985h> T A(String str, Class<T> cls) {
        return (T) this.f65622a.c(str, cls);
    }

    @Override // jd.InterfaceC14986i
    public final void M(String str, C14985h c14985h) {
        this.f65622a.d(str, c14985h);
    }

    @Override // jd.InterfaceC14986i
    public final Activity R() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f65622a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f65622a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f65622a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f65622a.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f65622a.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f65622a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f65622a.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f65622a.l();
    }
}
