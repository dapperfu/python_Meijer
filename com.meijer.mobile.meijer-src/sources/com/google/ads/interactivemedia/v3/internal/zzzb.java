package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzzb extends zzace {
    private static final Writer zza = new zzza();
    private static final zzwb zzb = new zzwb("closed");
    private final List zzc;
    private String zzd;
    private zzvw zze;

    @Override // com.google.ads.interactivemedia.v3.internal.zzace, java.io.Flushable
    public final void flush() throws IOException {
    }

    public zzzb() {
        super(zza);
        this.zzc = new ArrayList();
        this.zze = zzvy.zza;
    }

    private final zzvw zzv() {
        return (zzvw) this.zzc.get(this.zzc.size() - 1);
    }

    private final void zzw(zzvw zzvwVar) {
        if (this.zzd != null) {
            if (!(zzvwVar instanceof zzvy) || zzs()) {
                ((zzvz) zzv()).zzb(this.zzd, zzvwVar);
            }
            this.zzd = null;
            return;
        }
        if (this.zzc.isEmpty()) {
            this.zze = zzvwVar;
            return;
        }
        zzvw zzvwVarZzv = zzv();
        if (!(zzvwVarZzv instanceof zzvu)) {
            throw new IllegalStateException();
        }
        ((zzvu) zzvwVarZzv).zza(zzvwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.zzc.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.zzc.add(zzb);
    }

    public final zzvw zza() {
        if (this.zzc.isEmpty()) {
            return this.zze;
        }
        throw new IllegalStateException("Expected one JSON element but was ".concat(this.zzc.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzb() throws IOException {
        zzvu zzvuVar = new zzvu();
        zzw(zzvuVar);
        this.zzc.add(zzvuVar);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzc() throws IOException {
        zzvz zzvzVar = new zzvz();
        zzw(zzvzVar);
        this.zzc.add(zzvzVar);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzd() throws IOException {
        if (this.zzc.isEmpty() || this.zzd != null) {
            throw new IllegalStateException();
        }
        if (!(zzv() instanceof zzvu)) {
            throw new IllegalStateException();
        }
        this.zzc.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zze() throws IOException {
        if (this.zzc.isEmpty() || this.zzd != null) {
            throw new IllegalStateException();
        }
        if (!(zzv() instanceof zzvz)) {
            throw new IllegalStateException();
        }
        this.zzc.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzc.isEmpty() || this.zzd != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(zzv() instanceof zzvz)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzd = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzg() throws IOException {
        zzw(zzvy.zza);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzi(long j10) throws IOException {
        zzw(new zzwb(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzj(Boolean bool) throws IOException {
        if (bool == null) {
            zzw(zzvy.zza);
            return this;
        }
        zzw(new zzwb(bool));
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzk(Number number) throws IOException {
        if (number == null) {
            zzw(zzvy.zza);
            return this;
        }
        if (!zzu()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(number.toString()));
            }
        }
        zzw(new zzwb(number));
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzl(String str) throws IOException {
        if (str == null) {
            zzw(zzvy.zza);
            return this;
        }
        zzw(new zzwb(str));
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzm(boolean z10) throws IOException {
        zzw(new zzwb(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzace
    public final zzace zzh(double d10) throws IOException {
        if (!zzu() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        zzw(new zzwb(Double.valueOf(d10)));
        return this;
    }
}
