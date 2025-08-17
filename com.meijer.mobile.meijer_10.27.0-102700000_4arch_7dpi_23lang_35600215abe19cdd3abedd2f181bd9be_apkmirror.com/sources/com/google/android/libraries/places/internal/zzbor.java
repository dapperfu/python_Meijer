package com.google.android.libraries.places.internal;

import Be.j;
import java.io.InputStream;

/* loaded from: classes6.dex */
abstract class zzbor implements zzblr {
    zzbor() {
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final zzbez zzam() {
        throw null;
    }

    protected abstract zzblr zze();

    @Override // com.google.android.libraries.places.internal.zzblr
    public void zzf(zzblt zzbltVar) {
        throw null;
    }

    public final String toString() {
        return j.c(this).d("delegate", zze()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        zze().zza(zzbggVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i10) {
        zze().zzb(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i10) {
        zze().zzc(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        zze().zzd(zzbgjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        zze().zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzl(zzbjv zzbjvVar) {
        zze().zzl(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        return zze().zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zze().zzn(zzbplVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        zze().zzr();
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i10) {
        zze().zzs(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) {
        zze().zzt(inputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        zze().zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        zze().zzv(zzbfuVar);
    }
}
