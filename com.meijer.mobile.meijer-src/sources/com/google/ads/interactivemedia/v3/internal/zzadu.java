package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzadu;
import com.google.ads.interactivemedia.v3.internal.zzady;
import java.io.IOException;

/* loaded from: classes4.dex */
public class zzadu<MessageType extends zzady<MessageType, BuilderType>, BuilderType extends zzadu<MessageType, BuilderType>> extends zzacg<MessageType, BuilderType> {
    protected zzady zza;
    private final zzady zzb;

    @Override // com.google.ads.interactivemedia.v3.internal.zzafc
    public final /* synthetic */ zzafb zzaS() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafc
    public final boolean zzaT() {
        return zzady.zzaO(this.zza, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacg
    /* renamed from: zzai, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzadu zzah() {
        zzadu zzaduVar = (zzadu) this.zzb.zzm(5, null, null);
        zzaduVar.zza = zzan();
        return zzaduVar;
    }

    public final zzadu zzaj(zzady zzadyVar) {
        if (!this.zzb.equals(zzadyVar)) {
            if (!this.zza.zzaP()) {
                zzaq();
            }
            zza(this.zza, zzadyVar);
        }
        return this;
    }

    public final zzadu zzak(byte[] bArr, int i10, int i11, zzadk zzadkVar) throws zzaeg {
        if (!this.zza.zzaP()) {
            zzaq();
        }
        try {
            zzafi.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzacl(zzadkVar));
            return this;
        } catch (zzaeg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafa
    /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaP()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaK();
        return (MessageType) this.zza;
    }

    protected final void zzap() {
        if (this.zza.zzaP()) {
            return;
        }
        zzaq();
    }

    protected void zzaq() {
        zzady zzadyVarZzaB = this.zzb.zzaB();
        zza(zzadyVarZzaB, this.zza);
        this.zza = zzadyVarZzaB;
    }

    protected zzadu(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaP()) {
            this.zza = messagetype.zzaB();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzafi.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final MessageType zzal() {
        MessageType messagetype = (MessageType) zzan();
        if (zzady.zzaO(messagetype, true)) {
            return messagetype;
        }
        throw new zzagg(messagetype);
    }
}
