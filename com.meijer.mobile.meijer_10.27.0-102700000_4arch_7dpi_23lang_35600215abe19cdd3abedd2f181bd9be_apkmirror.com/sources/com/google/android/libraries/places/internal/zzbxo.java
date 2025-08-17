package com.google.android.libraries.places.internal;

import Be.p;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
final class zzbxo implements Runnable {
    final /* synthetic */ CountDownLatch zza;
    final /* synthetic */ CyclicBarrier zzb;
    final /* synthetic */ zzbwx zzc;
    final /* synthetic */ CountDownLatch zzd;
    final /* synthetic */ zzbxt zze;

    zzbxo(zzbxt zzbxtVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, zzbwx zzbwxVar, CountDownLatch countDownLatch2) {
        this.zza = countDownLatch;
        this.zzb = cyclicBarrier;
        this.zzc = zzbwxVar;
        this.zzd = countDownLatch2;
        Objects.requireNonNull(zzbxtVar);
        this.zze = zzbxtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbxt zzbxtVar;
        zzbxr zzbxrVar;
        zzcbl zzcblVarZzc = zzcbp.zzc(new zzbxn(this));
        try {
        } catch (zzbjw e10) {
            this.zze.zzu(0, zzbyz.INTERNAL_ERROR, e10.zza());
            zzbxtVar = this.zze;
            zzbxrVar = new zzbxr(zzbxtVar, zzbxtVar.zzC().zza(zzcblVarZzc, true));
        }
        try {
            try {
                try {
                    this.zza.await();
                    this.zzb.await(1000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    zzbxt zzbxtVar2 = this.zze;
                    zzbxtVar2.zzM(new zzbxr(zzbxtVar2, zzbxtVar2.zzC().zza(zzcblVarZzc, true)));
                    this.zzd.countDown();
                    throw th2;
                }
            } catch (Exception e11) {
                zzbxt zzbxtVar3 = this.zze;
                zzbxtVar3.zzg(e11);
                zzbxtVar = zzbxtVar3;
                zzbxrVar = new zzbxr(zzbxtVar, zzbxtVar.zzC().zza(zzcblVarZzc, true));
                zzbxtVar.zzM(zzbxrVar);
                this.zzd.countDown();
                return;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
            zzbxtVar = this.zze;
            zzbxtVar.zzu(0, zzbyz.INTERNAL_ERROR, zzbjv.zzi.zze("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
            zzbxrVar = new zzbxr(zzbxtVar, zzbxtVar.zzC().zza(zzcblVarZzc, true));
            zzbxtVar.zzM(zzbxrVar);
            this.zzd.countDown();
            return;
        }
        zzbxt zzbxtVar4 = this.zze;
        zzbgt zzbgtVar = zzbxtVar4.zzb;
        if (zzbgtVar == null) {
            zzbxtVar4.zzx(zzbxtVar4.zzS().createSocket(zzbxtVar4.zzA().getAddress(), zzbxtVar4.zzA().getPort()));
        } else {
            if (!(zzbgtVar.zzc() instanceof InetSocketAddress)) {
                zzbjv zzbjvVar = zzbjv.zzh;
                String strValueOf = String.valueOf(zzbgtVar.zzc().getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 41);
                sb2.append("Unsupported SocketAddress implementation ");
                sb2.append(strValueOf);
                throw new zzbjw(zzbjvVar.zze(sb2.toString()), null);
            }
            zzbxtVar4.zzx(zzbxtVar4.zzs(zzbgtVar.zzd(), (InetSocketAddress) zzbgtVar.zzc(), zzbgtVar.zzb(), zzbgtVar.zza()));
        }
        if (zzbxtVar4.zzT() != null) {
            SSLSocketFactory sSLSocketFactoryZzT = zzbxtVar4.zzT();
            HostnameVerifier hostnameVerifierZzU = zzbxtVar4.zzU();
            Socket socketZzw = zzbxtVar4.zzw();
            String strZzk = zzbxtVar4.zzk();
            int iZzl = zzbxtVar4.zzl();
            zzbyl zzbylVarZzX = zzbxtVar4.zzX();
            int i10 = zzbya.zzb;
            p.r(sSLSocketFactoryZzT, "sslSocketFactory");
            p.r(socketZzw, "socket");
            p.r(zzbylVarZzX, "spec");
            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactoryZzT.createSocket(socketZzw, strZzk, iZzl, true);
            zzbylVarZzX.zzb(sSLSocket, false);
            String strZza = zzbxy.zzd().zza(sSLSocket, strZzk, zzbylVarZzX.zza() ? zzbya.zza : null);
            List list = zzbya.zza;
            boolean zContains = list.contains(zzbyw.zza(strZza));
            String strValueOf2 = String.valueOf(list);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 50);
            sb3.append("Only ");
            sb3.append(strValueOf2);
            sb3.append(" are supported, but negotiated protocol is %s");
            p.z(zContains, sb3.toString(), strZza);
            if (!hostnameVerifierZzU.verify((strZzk.startsWith("[") && strZzk.endsWith("]")) ? strZzk.substring(1, strZzk.length() - 1) : strZzk, sSLSocket.getSession())) {
                throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(strZzk));
            }
            zzbxtVar4.zzz(sSLSocket.getSession());
            zzbxtVar4.zzx(sSLSocket);
        }
        zzbxtVar4.zzw().setTcpNoDelay(true);
        zzcbl zzcblVarZzc2 = zzcbp.zzc(zzcbp.zzb(zzbxtVar4.zzw()));
        this.zzc.zzb(zzcbp.zza(zzbxtVar4.zzw()), zzbxtVar4.zzw());
        zzbex zzbexVarZzc = zzbxtVar4.zzN().zzc();
        zzbexVarZzc.zza(zzbgr.zza, zzbxtVar4.zzw().getRemoteSocketAddress());
        zzbexVarZzc.zza(zzbgr.zzb, zzbxtVar4.zzw().getLocalSocketAddress());
        zzbexVarZzc.zza(zzbgr.zzc, zzbxtVar4.zzy());
        zzbexVarZzc.zza(zzbox.zza, zzbxtVar4.zzy() == null ? zzbjo.NONE : zzbjo.PRIVACY_AND_INTEGRITY);
        zzbxtVar4.zzO(zzbexVarZzc.zzc());
        zzbxtVar4.zzM(new zzbxr(zzbxtVar4, zzbxtVar4.zzC().zza(zzcblVarZzc2, true)));
        this.zzd.countDown();
        synchronized (zzbxtVar4.zzG()) {
            try {
                zzbxtVar4.zzV((Socket) p.r(zzbxtVar4.zzw(), "socket"));
                if (zzbxtVar4.zzy() != null) {
                }
            } finally {
            }
        }
    }
}
