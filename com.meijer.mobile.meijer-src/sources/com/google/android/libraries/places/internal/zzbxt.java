package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import De.w;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.internal.HttpHeaders;
import io.constructor.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
final class zzbxt implements zzbmg, zzbwy, zzbyf {
    static final boolean zza;
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze;
    private static final Logger zzf;
    private int zzA;
    private zzbxr zzB;
    private zzbez zzC;
    private zzbjv zzD;
    private boolean zzE;
    private zzbpj zzF;
    private boolean zzG;
    private boolean zzH;
    private final SocketFactory zzI;
    private SSLSocketFactory zzJ;
    private HostnameVerifier zzK;
    private Socket zzL;
    private int zzM;
    private final Deque zzN;
    private final zzbyl zzO;
    private zzbqk zzP;
    private final Runnable zzQ;
    private final int zzR;
    private final zzbwp zzS;
    private final Map zzT;
    private final zzbpk zzU;
    final zzbgt zzb;
    int zzc;
    private Socket zzg;
    private SSLSession zzh;
    private final InetSocketAddress zzi;
    private final String zzj;
    private final String zzk;
    private final Random zzl;
    private final w zzm;
    private final int zzn;
    private final zzbzp zzo;
    private zzbsi zzp;
    private zzbwz zzq;
    private zzbyh zzr;
    private final Object zzs;
    private final zzbhf zzt;
    private int zzu;
    private final Map zzv;
    private final Executor zzw;
    private final zzbvw zzx;
    private final ScheduledExecutorService zzy;
    private final int zzz;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final boolean zzr() {
        boolean z10 = false;
        while (true) {
            Deque deque = this.zzN;
            if (deque.isEmpty() || this.zzv.size() >= this.zzM) {
                break;
            }
            zzab((zzbxk) deque.poll());
            z10 = true;
        }
        return z10;
    }

    final /* synthetic */ InetSocketAddress zzA() {
        return this.zzi;
    }

    final /* synthetic */ int zzB() {
        return this.zzn;
    }

    final /* synthetic */ zzbzp zzC() {
        return this.zzo;
    }

    final /* synthetic */ zzbsi zzD() {
        return this.zzp;
    }

    final /* synthetic */ zzbwz zzE() {
        return this.zzq;
    }

    final /* synthetic */ zzbyh zzF() {
        return this.zzr;
    }

    final /* synthetic */ Object zzG() {
        return this.zzs;
    }

    final /* synthetic */ Map zzH() {
        return this.zzv;
    }

    final /* synthetic */ Executor zzI() {
        return this.zzw;
    }

    final /* synthetic */ int zzJ() {
        return this.zzA;
    }

    final /* synthetic */ void zzK(int i10) {
        this.zzA = i10;
    }

    final /* synthetic */ zzbxr zzL() {
        return this.zzB;
    }

    final /* synthetic */ void zzM(zzbxr zzbxrVar) {
        this.zzB = zzbxrVar;
    }

    final /* synthetic */ zzbez zzN() {
        return this.zzC;
    }

    final /* synthetic */ void zzO(zzbez zzbezVar) {
        this.zzC = zzbezVar;
    }

    final /* synthetic */ zzbjv zzP() {
        return this.zzD;
    }

    final /* synthetic */ zzbpj zzQ() {
        return this.zzF;
    }

    final /* synthetic */ void zzR(zzbpj zzbpjVar) {
        this.zzF = null;
    }

    final /* synthetic */ SocketFactory zzS() {
        return this.zzI;
    }

    final /* synthetic */ SSLSocketFactory zzT() {
        return this.zzJ;
    }

    final /* synthetic */ HostnameVerifier zzU() {
        return this.zzK;
    }

    final /* synthetic */ void zzV(Socket socket) {
        this.zzL = socket;
    }

    final /* synthetic */ void zzW(int i10) {
        this.zzM = i10;
    }

    final /* synthetic */ zzbyl zzX() {
        return this.zzO;
    }

    final /* synthetic */ zzbqk zzY() {
        return this.zzP;
    }

    final /* synthetic */ Runnable zzZ() {
        return this.zzQ;
    }

    final /* synthetic */ int zzaa() {
        return this.zzR;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.internal.zzbmg
    public final zzbez zzf() {
        return this.zzC;
    }

    final boolean zzh() {
        return this.zzJ == null;
    }

    final /* synthetic */ Socket zzw() {
        return this.zzg;
    }

    final /* synthetic */ void zzx(Socket socket) {
        this.zzg = socket;
    }

    final /* synthetic */ SSLSession zzy() {
        return this.zzh;
    }

    final /* synthetic */ void zzz(SSLSession sSLSession) {
        this.zzh = sSLSession;
    }

    static {
        EnumMap enumMap = new EnumMap(zzbyz.class);
        zzbyz zzbyzVar = zzbyz.NO_ERROR;
        zzbjv zzbjvVar = zzbjv.zzh;
        enumMap.put((EnumMap) zzbyzVar, (zzbyz) zzbjvVar.zze("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) zzbyz.PROTOCOL_ERROR, (zzbyz) zzbjvVar.zze("Protocol error"));
        enumMap.put((EnumMap) zzbyz.INTERNAL_ERROR, (zzbyz) zzbjvVar.zze("Internal error"));
        enumMap.put((EnumMap) zzbyz.FLOW_CONTROL_ERROR, (zzbyz) zzbjvVar.zze("Flow control error"));
        enumMap.put((EnumMap) zzbyz.STREAM_CLOSED, (zzbyz) zzbjvVar.zze("Stream closed"));
        enumMap.put((EnumMap) zzbyz.FRAME_TOO_LARGE, (zzbyz) zzbjvVar.zze("Frame too large"));
        enumMap.put((EnumMap) zzbyz.REFUSED_STREAM, (zzbyz) zzbjv.zzi.zze("Refused stream"));
        enumMap.put((EnumMap) zzbyz.CANCEL, (zzbyz) zzbjv.zzb.zze("Cancelled"));
        enumMap.put((EnumMap) zzbyz.COMPRESSION_ERROR, (zzbyz) zzbjvVar.zze("Compression error"));
        enumMap.put((EnumMap) zzbyz.CONNECT_ERROR, (zzbyz) zzbjvVar.zze("Connect error"));
        enumMap.put((EnumMap) zzbyz.ENHANCE_YOUR_CALM, (zzbyz) zzbjv.zzf.zze("Enhance your calm"));
        enumMap.put((EnumMap) zzbyz.INADEQUATE_SECURITY, (zzbyz) zzbjv.zze.zze("Inadequate security"));
        zze = Collections.unmodifiableMap(enumMap);
        zzf = Logger.getLogger(zzbxt.class.getName());
        zza = zzbpf.zzj("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public zzbxt(zzbxg zzbxgVar, InetSocketAddress inetSocketAddress, String str, String str2, zzbez zzbezVar, zzbgt zzbgtVar, Runnable runnable, zzbff zzbffVar) {
        w wVar = zzbpf.zzo;
        zzbzl zzbzlVar = new zzbzl();
        this.zzl = new Random();
        Object obj = new Object();
        this.zzs = obj;
        this.zzv = new HashMap();
        this.zzM = 0;
        this.zzN = new LinkedList();
        this.zzT = new zzbxs(null);
        this.zzU = new zzbxl(this);
        this.zzc = 30000;
        this.zzi = (InetSocketAddress) p.r(inetSocketAddress, PlaceTypes.ADDRESS);
        this.zzj = str;
        this.zzz = 4194304;
        this.zzn = 65535;
        this.zzw = (Executor) p.r(zzbxgVar.zza, "executor");
        this.zzx = new zzbvw(zzbxgVar.zza);
        this.zzy = (ScheduledExecutorService) p.r(zzbxgVar.zzb, "scheduledExecutorService");
        this.zzu = 3;
        this.zzI = SocketFactory.getDefault();
        this.zzJ = zzbxgVar.zzd;
        this.zzK = zzbyp.zza;
        this.zzO = (zzbyl) p.r(zzbxgVar.zze, "connectionSpec");
        this.zzm = (w) p.r(wVar, "stopwatchFactory");
        this.zzo = (zzbzp) p.r(zzbzlVar, "variant");
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-okhttp/1.75.0-SNAPSHOT");
        this.zzk = sb2.toString();
        this.zzb = zzbgtVar;
        this.zzQ = (Runnable) p.r(runnable, "tooManyPingsRunnable");
        this.zzR = a.e.API_PRIORITY_OTHER;
        this.zzS = zzbxgVar.zzc.zza();
        this.zzt = zzbhf.zza(zzbxt.class, inetSocketAddress.toString());
        zzbex zzbexVarZzb = zzbez.zzb();
        zzbexVarZzb.zza(zzbox.zzb, zzbezVar);
        this.zzC = zzbexVarZzb.zzc();
        synchronized (obj) {
        }
    }

    private static String zzad(zzcbz zzcbzVar) throws IOException {
        zzcbj zzcbjVar = new zzcbj();
        while (zzcbzVar.zza(zzcbjVar, 1L) != -1) {
            if (zzcbjVar.zzk(zzcbjVar.zzb() - 1) == 10) {
                return zzcbjVar.zzq(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: ".concat(String.valueOf(zzcbjVar.zzn(zzcbjVar.zzb()).zzg())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzu(int i10, zzbyz zzbyzVar, zzbjv zzbjvVar) {
        synchronized (this.zzs) {
            try {
                if (this.zzD == null) {
                    this.zzD = zzbjvVar;
                    this.zzp.zzd(zzbjvVar);
                }
                if (zzbyzVar != null && !this.zzE) {
                    this.zzE = true;
                    this.zzq.zzj(0, zzbyzVar, new byte[0]);
                }
                Iterator it = this.zzv.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i10) {
                        it.remove();
                        ((zzbxk) entry.getValue()).zzy().zzg(zzbjvVar, zzbls.REFUSED, false, new zzbip());
                        zzag((zzbxk) entry.getValue());
                    }
                }
                Deque<zzbxk> deque = this.zzN;
                for (zzbxk zzbxkVar : deque) {
                    zzbxkVar.zzy().zzg(zzbjvVar, zzbls.MISCARRIED, true, new zzbip());
                    zzag(zzbxkVar);
                }
                deque.clear();
                zzaf();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzaf() {
        if (this.zzD == null || !this.zzv.isEmpty() || !this.zzN.isEmpty() || this.zzG) {
            return;
        }
        this.zzG = true;
        zzbqk zzbqkVar = this.zzP;
        if (zzbqkVar != null) {
            zzbqkVar.zzd();
        }
        zzbpj zzbpjVar = this.zzF;
        if (zzbpjVar != null) {
            zzbpjVar.zzc(zzai());
            this.zzF = null;
        }
        if (!this.zzE) {
            this.zzE = true;
            this.zzq.zzj(0, zzbyz.NO_ERROR, new byte[0]);
        }
        this.zzq.close();
    }

    private final void zzag(zzbxk zzbxkVar) {
        if (this.zzH && this.zzN.isEmpty() && this.zzv.isEmpty()) {
            this.zzH = false;
            zzbqk zzbqkVar = this.zzP;
            if (zzbqkVar != null) {
                zzbqkVar.zzc();
            }
        }
        if (zzbxkVar.zzi()) {
            this.zzU.zza(zzbxkVar, false);
        }
    }

    private final void zzah(zzbxk zzbxkVar) {
        if (!this.zzH) {
            this.zzH = true;
            zzbqk zzbqkVar = this.zzP;
            if (zzbqkVar != null) {
                zzbqkVar.zzb();
            }
        }
        if (zzbxkVar.zzi()) {
            this.zzU.zza(zzbxkVar, true);
        }
    }

    private final zzbjv zzai() {
        synchronized (this.zzs) {
            try {
                zzbjv zzbjvVar = this.zzD;
                if (zzbjvVar != null) {
                    return zzbjvVar;
                }
                return zzbjv.zzi.zze("Connection closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static zzbjv zzq(zzbyz zzbyzVar) {
        zzbjv zzbjvVar = (zzbjv) zze.get(zzbyzVar);
        if (zzbjvVar != null) {
            return zzbjvVar;
        }
        zzbjv zzbjvVar2 = zzbjv.zzc;
        int i10 = zzbyzVar.zzs;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Unknown http2 error code: ");
        sb2.append(i10);
        return zzbjvVar2.zze(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Runnable zzao(zzbsi zzbsiVar) throws Throwable {
        this.zzp = (zzbsi) p.r(zzbsiVar, "listener");
        zzbwx zzbwxVarZza = zzbwx.zza(this.zzx, this, 10000);
        zzbwv zzbwvVar = new zzbwv(zzbwxVarZza, this.zzo.zzb(zzcbp.zzd(zzbwxVarZza), true));
        synchronized (this.zzs) {
            try {
                zzbwz zzbwzVar = new zzbwz(this, zzbwvVar);
                this.zzq = zzbwzVar;
                this.zzr = new zzbyh(this, zzbwzVar);
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.zzx.execute(new zzbxo(this, countDownLatch, cyclicBarrier, zzbwxVarZza, countDownLatch2));
        this.zzw.execute(new zzbxp(this, cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.zzs) {
                this.zzq.zzd();
                zzbzo zzbzoVar = new zzbzo();
                zzbzoVar.zza(7, 0, this.zzn);
                this.zzq.zzi(zzbzoVar);
            }
            countDownLatch.countDown();
            this.zzx.execute(new zzbxq(this));
            return null;
        } catch (Throwable th4) {
            countDownLatch.countDown();
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblu
    public final /* bridge */ /* synthetic */ zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        zzbxk zzbxkVar;
        p.r(zzbiuVar, "method");
        p.r(zzbipVar, "headers");
        zzbwg zzbwgVarZza = zzbwg.zza(zzbfpVarArr, this.zzC, zzbipVar);
        Object obj = this.zzs;
        synchronized (obj) {
            zzbxkVar = new zzbxk(zzbiuVar, zzbipVar, this.zzq, this, this.zzr, obj, this.zzz, this.zzn, this.zzj, this.zzk, zzbwgVarZza, this.zzS, zzbfdVar, false);
        }
        return zzbxkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zzd(zzbjv zzbjvVar) {
        synchronized (this.zzs) {
            try {
                if (this.zzD != null) {
                    return;
                }
                this.zzD = zzbjvVar;
                this.zzp.zzd(zzbjvVar);
                zzaf();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwy
    public final void zzg(Throwable th2) {
        p.r(th2, "failureCause");
        zzu(0, zzbyz.INTERNAL_ERROR, zzbjv.zzi.zzd(th2));
    }

    final void zzi(zzbxk zzbxkVar, String str) {
        zzbjv zzbjvVar;
        zzbjv zzbjvVar2 = this.zzD;
        if (zzbjvVar2 != null) {
            zzbxkVar.zzy().zzg(zzbjvVar2, zzbls.MISCARRIED, true, new zzbip());
            return;
        }
        if ((this.zzL instanceof SSLSocket) && !str.equals(this.zzj)) {
            Map map = this.zzT;
            if (map.containsKey(str)) {
                zzbjvVar = (zzbjv) map.get(str);
            } else {
                zzbjv zzbjvVarZze = this.zzK.verify(str, ((SSLSocket) this.zzL).getSession()) ? zzbjv.zza : zzbjv.zzi.zze(String.format("HostNameVerifier verification failed for authority '%s'", str));
                if (!zzbjvVarZze.zzj() && !zza) {
                    zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str));
                }
                if (zzbjvVarZze.zzj()) {
                    zzbjvVarZze = zzbjv.zzi.zze(String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", str));
                }
                map.put(str, zzbjvVarZze);
                zzbjvVar = zzbjvVarZze;
            }
            if (!zzbjvVar.zzj() && zza) {
                zzbxkVar.zzy().zzg(zzbjvVar, zzbls.PROCESSED, true, new zzbip());
                return;
            }
        }
        if (this.zzv.size() < this.zzM) {
            zzab(zzbxkVar);
        } else {
            this.zzN.add(zzbxkVar);
            zzah(zzbxkVar);
        }
    }

    final void zzj(zzbxk zzbxkVar) {
        this.zzN.remove(zzbxkVar);
        zzag(zzbxkVar);
    }

    final String zzk() {
        String str = this.zzj;
        URI uriZzb = zzbpf.zzb(str);
        return uriZzb.getHost() != null ? uriZzb.getHost() : str;
    }

    final int zzl() {
        URI uriZzb = zzbpf.zzb(this.zzj);
        return uriZzb.getPort() != -1 ? uriZzb.getPort() : this.zzi.getPort();
    }

    @Override // com.google.android.libraries.places.internal.zzbyf
    public final zzbye[] zzm() {
        zzbye[] zzbyeVarArr;
        synchronized (this.zzs) {
            try {
                Map map = this.zzv;
                zzbyeVarArr = new zzbye[map.size()];
                Iterator it = map.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    zzbyeVarArr[i10] = ((zzbxk) it.next()).zzy().zzK();
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbyeVarArr;
    }

    final void zzn(int i10, zzbjv zzbjvVar, zzbls zzblsVar, boolean z10, zzbyz zzbyzVar, zzbip zzbipVar) {
        synchronized (this.zzs) {
            try {
                zzbxk zzbxkVar = (zzbxk) this.zzv.remove(Integer.valueOf(i10));
                if (zzbxkVar != null) {
                    if (zzbyzVar != null) {
                        this.zzq.zzb(i10, zzbyz.CANCEL);
                    }
                    if (zzbjvVar != null) {
                        zzbxj zzbxjVarZzy = zzbxkVar.zzy();
                        if (zzbipVar == null) {
                            zzbipVar = new zzbip();
                        }
                        zzbxjVarZzy.zzg(zzbjvVar, zzblsVar, z10, zzbipVar);
                    }
                    if (!zzr()) {
                        zzaf();
                    }
                    zzag(zzbxkVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean zzo(int i10) {
        boolean z10;
        synchronized (this.zzs) {
            z10 = false;
            if (i10 < this.zzu && (i10 & 1) == 1) {
                z10 = true;
            }
        }
        return z10;
    }

    final zzbxk zzp(int i10) {
        zzbxk zzbxkVar;
        synchronized (this.zzs) {
            zzbxkVar = (zzbxk) this.zzv.get(Integer.valueOf(i10));
        }
        return zzbxkVar;
    }

    final /* synthetic */ Socket zzs(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws NumberFormatException, IOException, zzbjw {
        Socket socketCreateSocket;
        int i10;
        String strSubstring;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.zzI.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.zzI.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(this.zzc);
                zzcbz zzcbzVarZzb = zzcbp.zzb(socketCreateSocket);
                zzcbk zzcbkVarZzd = zzcbp.zzd(zzcbp.zza(socketCreateSocket));
                zzbzq zzbzqVar = new zzbzq();
                zzbzqVar.zza(BuildConfig.SERVICE_SCHEME);
                zzbzqVar.zzb(inetSocketAddress.getHostName());
                zzbzqVar.zzc(inetSocketAddress.getPort());
                zzbzr zzbzrVarZze = zzbzqVar.zze();
                zzbzs zzbzsVar = new zzbzs();
                zzbzsVar.zza(zzbzrVarZze);
                String strZza = zzbzrVarZze.zza();
                int iZzb = zzbzrVarZze.zzb();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 1 + String.valueOf(iZzb).length());
                sb2.append(strZza);
                sb2.append(":");
                sb2.append(iZzb);
                zzbzsVar.zzb("Host", sb2.toString());
                zzbzsVar.zzb(HttpHeaders.USER_AGENT, this.zzk);
                if (str != null && str2 != null) {
                    try {
                        StringBuilder sb3 = new StringBuilder(str.length() + 1 + str2.length());
                        sb3.append(str);
                        sb3.append(":");
                        sb3.append(str2);
                        byte[] bytes = sb3.toString().getBytes("ISO-8859-1");
                        zzcbn zzcbnVar = zzcbn.zza;
                        String strZzf = zzcbm.zzb(bytes).zzf();
                        StringBuilder sb4 = new StringBuilder(strZzf.length() + 6);
                        sb4.append("Basic ");
                        sb4.append(strZzf);
                        zzbzsVar.zzb("Proxy-Authorization", sb4.toString());
                    } catch (UnsupportedEncodingException unused) {
                        throw new AssertionError();
                    }
                }
                zzbzt zzbztVarZzc = zzbzsVar.zzc();
                zzbzr zzbzrVarZza = zzbztVarZzc.zza();
                zzcbkVarZzd.zzH(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", zzbzrVarZza.zza(), Integer.valueOf(zzbzrVarZza.zzb()))).zzH("\r\n");
                int iZza = zzbztVarZzc.zzb().zza();
                for (int i11 = 0; i11 < iZza; i11++) {
                    zzcbkVarZzd.zzH(zzbztVarZzc.zzb().zzb(i11)).zzH(": ").zzH(zzbztVarZzc.zzb().zzc(i11)).zzH("\r\n");
                }
                zzcbkVarZzd.zzH("\r\n");
                zzcbkVarZzd.flush();
                String strZzad = zzad(zzcbzVarZzb);
                if (strZzad.startsWith("HTTP/1.")) {
                    i10 = 9;
                    if (strZzad.length() < 9 || strZzad.charAt(8) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                    }
                    int iCharAt = strZzad.charAt(7) - '0';
                    if (iCharAt != 0 && iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                    }
                    zzbyw zzbywVar = zzbyw.HTTP_1_0;
                } else {
                    if (!strZzad.startsWith("ICY ")) {
                        throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                    }
                    zzbyw zzbywVar2 = zzbyw.HTTP_1_0;
                    i10 = 4;
                }
                int i12 = i10 + 3;
                if (strZzad.length() < i12) {
                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                }
                try {
                    int i13 = Integer.parseInt(strZzad.substring(i10, i12));
                    if (strZzad.length() <= i12) {
                        strSubstring = "";
                    } else {
                        if (strZzad.charAt(i12) != ' ') {
                            throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                        }
                        strSubstring = strZzad.substring(i10 + 4);
                    }
                    while (!zzad(zzcbzVarZzb).equals("")) {
                    }
                    if (i13 >= 200 && i13 < 300) {
                        socketCreateSocket.setSoTimeout(0);
                        return socketCreateSocket;
                    }
                    zzcbj zzcbjVar = new zzcbj();
                    try {
                        socketCreateSocket.shutdownOutput();
                        zzcbzVarZzb.zza(zzcbjVar, 1024L);
                    } catch (IOException e10) {
                        String string = e10.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 21);
                        sb5.append("Unable to read body: ");
                        sb5.append(string);
                        zzcbjVar.zzv(sb5.toString());
                    }
                    try {
                        socketCreateSocket.close();
                    } catch (IOException unused2) {
                    }
                    throw new zzbjw(zzbjv.zzi.zze(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(i13), strSubstring, zzcbjVar.zzo())), null);
                } catch (NumberFormatException unused3) {
                    throw new ProtocolException("Unexpected status line: ".concat(strZzad));
                }
            } catch (IOException e11) {
                e = e11;
                if (socketCreateSocket != null) {
                    zzbpf.zzh(socketCreateSocket);
                }
                throw new zzbjw(zzbjv.zzi.zze("Failed trying to connect with proxy").zzd(e), null);
            }
        } catch (IOException e12) {
            e = e12;
            socketCreateSocket = null;
        }
    }

    private final void zzab(zzbxk zzbxkVar) {
        boolean z10;
        if (zzbxkVar.zzy().zzJ() == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p.x(z10, "StreamId already assigned");
        this.zzv.put(Integer.valueOf(this.zzu), zzbxkVar);
        zzah(zzbxkVar);
        zzbxkVar.zzy().zzF(this.zzu);
        if (zzbxkVar.zzz() != zzbis.UNARY && zzbxkVar.zzz() != zzbis.SERVER_STREAMING) {
            this.zzq.zze();
        } else {
            zzbxkVar.zzA();
        }
        int i10 = this.zzu;
        if (i10 >= 2147483645) {
            this.zzu = a.e.API_PRIORITY_OTHER;
            zzu(a.e.API_PRIORITY_OTHER, zzbyz.NO_ERROR, zzbjv.zzi.zze("Stream ids exhausted"));
        } else {
            this.zzu = i10 + 2;
        }
    }

    public final String toString() {
        return j.c(this).c("logId", this.zzt.zzc()).d(PlaceTypes.ADDRESS, this.zzi).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zze(zzbjv zzbjvVar) {
        zzd(zzbjvVar);
        synchronized (this.zzs) {
            try {
                Iterator it = this.zzv.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((zzbxk) entry.getValue()).zzy().zzg(zzbjvVar, zzbls.PROCESSED, false, new zzbip());
                    zzag((zzbxk) entry.getValue());
                }
                Deque<zzbxk> deque = this.zzN;
                for (zzbxk zzbxkVar : deque) {
                    zzbxkVar.zzy().zzg(zzbjvVar, zzbls.MISCARRIED, true, new zzbip());
                    zzag(zzbxkVar);
                }
                deque.clear();
                zzaf();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void zzt(zzbyz zzbyzVar, String str) {
        zzu(0, zzbyzVar, zzq(zzbyzVar).zzf(str));
    }
}
