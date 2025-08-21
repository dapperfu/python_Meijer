package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import jd.C14985h;
import jd.InterfaceC14986i;

/* loaded from: classes4.dex */
public final class zzd extends Fragment implements InterfaceC14986i {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f65623b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final f f65624a = new f();

    public static zzd u0(FragmentActivity fragmentActivity) {
        zzd zzdVar;
        WeakHashMap weakHashMap = f65623b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().e(zzdVar2, "SLifecycleFragmentImpl").i();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // jd.InterfaceC14986i
    public final <T extends C14985h> T A(String str, Class<T> cls) {
        return (T) this.f65624a.c(str, cls);
    }

    @Override // jd.InterfaceC14986i
    public final void M(String str, C14985h c14985h) {
        this.f65624a.d(str, c14985h);
    }

    @Override // jd.InterfaceC14986i
    public final Activity R() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f65624a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f65624a.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f65624a.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f65624a.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f65624a.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f65624a.j(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f65624a.k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f65624a.l();
    }
}
