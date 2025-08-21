package com.google.android.libraries.places.widget.internal.photoviewer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC6165l;
import androidx.viewpager2.adapter.a;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzk extends a {
    private List zza;

    public final void zza(List list) {
        Intrinsics.j(list, "<set-?>");
        this.zza = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(FragmentManager fragmentManager, AbstractC6165l lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.j(fragmentManager, "fragmentManager");
        Intrinsics.j(lifecycle, "lifecycle");
        this.zza = CollectionsKt.m();
    }

    @Override // androidx.viewpager2.adapter.a
    public final Fragment createFragment(int i10) {
        int i11 = zzj.zzb;
        com.google.android.libraries.places.widget.model.zzi photoPageData = (com.google.android.libraries.places.widget.model.zzi) this.zza.get(i10);
        Intrinsics.j(photoPageData, "photoPageData");
        zzj zzjVar = new zzj();
        Bundle bundle = new Bundle();
        bundle.putParcelable("page_data", photoPageData);
        zzjVar.setArguments(bundle);
        return zzjVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public final int getTotalNumberOfTabs() {
        return this.zza.size();
    }
}
