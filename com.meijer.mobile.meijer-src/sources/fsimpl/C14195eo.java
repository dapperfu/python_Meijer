package fsimpl;

import com.fullstory.util.Log;
import com.radiusnetworks.flybuy.sdk.data.order.OrderState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fsimpl.eo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14195eo {

    /* renamed from: d, reason: collision with root package name */
    private final E f133414d;

    /* renamed from: e, reason: collision with root package name */
    private final int f133415e;

    /* renamed from: f, reason: collision with root package name */
    private final int f133416f;

    /* renamed from: g, reason: collision with root package name */
    private int f133417g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC14194en f133418h;

    /* renamed from: i, reason: collision with root package name */
    private SortedSet f133419i;

    /* renamed from: j, reason: collision with root package name */
    private ThreadPoolExecutor f133420j;

    /* renamed from: l, reason: collision with root package name */
    private eG f133422l;

    /* renamed from: m, reason: collision with root package name */
    private C14200et f133423m;

    /* renamed from: n, reason: collision with root package name */
    private C14202ev f133424n;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f133413c = new AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    private final Object f133421k = new Object();

    /* renamed from: a, reason: collision with root package name */
    eI f133411a = eI.NATURAL;

    /* renamed from: o, reason: collision with root package name */
    private AtomicInteger f133425o = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    int f133412b = 10000;

    public C14195eo(E e10, int i10, int i11, int i12, InterfaceC14194en interfaceC14194en) {
        this.f133414d = e10;
        this.f133415e = i10;
        this.f133416f = i11;
        this.f133417g = i12;
        this.f133418h = interfaceC14194en;
    }

    private eE a(String str) {
        synchronized (this.f133421k) {
            for (eE eEVar : this.f133419i) {
                if (eEVar.f133322a.equals(str)) {
                    return eEVar;
                }
            }
            return null;
        }
    }

    private C14199es a(File file, File file2, eE eEVar) throws IOException {
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            try {
                FileLock fileLockTryLock = channel.tryLock(0L, Long.MAX_VALUE, false);
                if (fileLockTryLock == null || !fileLockTryLock.isValid()) {
                    fG.a(channel);
                    return null;
                }
                JSONObject jSONObject = new JSONObject(b(file).toString());
                C14199es c14199es = new C14199es(eEVar);
                c14199es.f133436d = channel;
                c14199es.f133437e = fileLockTryLock;
                c14199es.f133441i = eC.valueOf(jSONObject.getString("priority"));
                c14199es.f133439g = jSONObject.getLong("dateMs");
                c14199es.f133434b = file2;
                c14199es.f133438f = jSONObject.getString("originalFile");
                c14199es.f133435c = file;
                c14199es.f133442j = new URL(jSONObject.getString("url"));
                c14199es.f133443k = jSONObject.optString("contentType", null);
                c14199es.f133440h = jSONObject.optLong("size", 0L);
                c14199es.f133444l = jSONObject.optBoolean("encrypted", false);
                c14199es.f133445m = jSONObject.optBoolean(OrderState.READY, true);
                c14199es.f133446n = jSONObject.optString("hash", null);
                return c14199es;
            } catch (IOException | OverlappingFileLockException e10) {
                fG.a(channel);
                return null;
            }
        } catch (IOException | OverlappingFileLockException e11) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eH eHVar) throws Exception {
        for (int i10 = 0; i10 < 6; i10++) {
            try {
                eHVar.a();
                return;
            } catch (IOException e10) {
                if (i10 == 5) {
                    throw e10;
                }
                if ((e10 instanceof C14193em) && ((C14193em) e10).a()) {
                    throw e10;
                }
                Log.e("Retrying after I/O failure", e10);
                try {
                    double d10 = this.f133412b;
                    double dPow = Math.pow(2.0d, i10);
                    Double.isNaN(d10);
                    Thread.sleep((long) (d10 * dPow));
                } catch (InterruptedException e11) {
                    throw e10;
                }
            } catch (Exception e12) {
                Log.e("Unexpected error while uploading", e12);
                throw e12;
            }
        }
    }

    private void a(File file) {
        try {
            this.f133414d.a(file);
        } catch (IOException e10) {
            Log.e("Unexpectedly unable to trash file " + file.getAbsolutePath(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, IOException iOException) {
        eG eGVar = this.f133422l;
        if (eGVar != null) {
            eGVar.notify(str, str2, iOException, ((long) this.f133424n.a()) == 0 && ((long) this.f133420j.getActiveCount()) == 1);
        }
    }

    private boolean a(eE eEVar) {
        File[] fileArrListFiles = eEVar.f133323b.listFiles();
        if (fileArrListFiles == null) {
            Log.e("Unexpected error reading session directory " + eEVar.f133323b.getAbsolutePath());
            return false;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            if (file.getName().endsWith(".metadata")) {
                File file2 = new File(file.getParentFile(), file.getName().substring(0, file.getName().length() - ".metadata".length()));
                if (file2.exists()) {
                    try {
                        C14199es c14199esA = a(file, file2, eEVar);
                        if (c14199esA != null) {
                            try {
                                a(c14199esA);
                            } catch (IOException | JSONException e10) {
                                z10 = true;
                                Log.e("Error reading metadata file: " + file.getAbsolutePath());
                            }
                        }
                        z10 = true;
                    } catch (IOException e11) {
                    } catch (JSONException e12) {
                    }
                } else {
                    Log.e("Missing file associated with metadata: " + file2.getAbsolutePath());
                    a(file);
                }
            }
        }
        return z10;
    }

    private boolean a(C14199es c14199es) {
        synchronized (this.f133421k) {
            eE eEVar = c14199es.f133433a;
            if (c14199es.f133445m) {
                eEVar.f133325d.add(c14199es);
            } else {
                C14199es c14199es2 = (C14199es) eEVar.f133326e.put(c14199es.f133446n, c14199es);
                if (c14199es2 != null) {
                    eEVar.f133326e.put(c14199es.f133446n, c14199es2);
                    Log.d(String.format("Got a duplicate non-ready upload with hash=%s/session=%s, ignoring", c14199es.f133446n, eEVar.f133322a));
                    c14199es.a();
                    return false;
                }
            }
            if (c14199es.f133445m) {
                ThreadPoolExecutor threadPoolExecutor = this.f133420j;
                if (threadPoolExecutor == null) {
                    this.f133424n.offer(new RunnableC14204ex(this, c14199es));
                } else {
                    threadPoolExecutor.execute(new RunnableC14204ex(this, c14199es));
                }
            } else {
                this.f133423m.offer(c14199es);
            }
            return true;
        }
    }

    private eE b(String str) {
        synchronized (this.f133421k) {
            eE eEVarA = a(str);
            if (eEVarA != null) {
                return eEVarA;
            }
            long jD = d();
            File file = new File(this.f133414d.c(), str);
            fG.a(file, this.f133414d.b());
            File file2 = new File(file, ".session");
            file2.createNewFile();
            file2.setLastModified(jD);
            eE eEVar = new eE(file, jD);
            this.f133419i.add(eEVar);
            return eEVar;
        }
    }

    private StringBuilder b(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("utf8"));
            char[] cArr = new char[10240];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    return sb2;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    private SortedSet b() {
        TreeSet treeSet = new TreeSet();
        File[] fileArrListFiles = this.f133414d.c().listFiles();
        if (fileArrListFiles == null) {
            Log.e("Unexpected error listing files for upload");
            return treeSet;
        }
        long jD = d();
        long jConvert = jD - TimeUnit.MILLISECONDS.convert(this.f133416f, TimeUnit.DAYS);
        long jConvert2 = TimeUnit.MILLISECONDS.convert(1L, TimeUnit.DAYS) + jD;
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                File file2 = new File(file, ".session");
                long jLastModified = file2.exists() ? file2.lastModified() : file.lastModified();
                if (jLastModified <= jConvert || jLastModified >= jConvert2) {
                    Log.e("Not uploading session from " + new Date(jLastModified) + " (now=" + new Date(jD) + ")");
                    a(file);
                } else {
                    treeSet.add(new eE(file, jLastModified));
                }
            } else {
                a(file);
            }
            if (treeSet.size() > this.f133415e) {
                eE eEVar = (eE) treeSet.first();
                treeSet.remove(eEVar);
                file = eEVar.f133323b;
                a(file);
            }
        }
        return treeSet;
    }

    private void b(C14199es c14199es) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        FileOutputStream fileOutputStream = new FileOutputStream(c14199es.f133435c);
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.forName("utf8"));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("priority", c14199es.f133441i);
                jSONObject.put("file", c14199es.f133434b.getAbsolutePath());
                jSONObject.put("originalFile", c14199es.f133438f);
                jSONObject.put("url", c14199es.f133442j.toString());
                jSONObject.put("session", c14199es.f133433a.f133322a);
                jSONObject.put("dateMs", c14199es.f133439g);
                jSONObject.put("contentType", c14199es.f133443k);
                jSONObject.put("size", c14199es.f133440h);
                jSONObject.put("encrypted", c14199es.f133444l);
                jSONObject.put("hash", c14199es.f133446n);
                jSONObject.put(OrderState.READY, c14199es.f133445m);
                outputStreamWriter.write(jSONObject.toString(2));
                outputStreamWriter.flush();
                fileOutputStream.close();
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    private void c() {
        Iterator it = this.f133419i.iterator();
        while (it.hasNext()) {
            eE eEVar = (eE) it.next();
            if (!a(eEVar)) {
                it.remove();
                a(eEVar.f133323b);
            }
        }
    }

    private long d() {
        switch (C14197eq.f133427a[this.f133411a.ordinal()]) {
            case 1:
                return System.currentTimeMillis();
            case 2:
                return this.f133425o.incrementAndGet() + 1500000000000L;
            default:
                return 0L;
        }
    }

    public void a() {
        synchronized (this.f133421k) {
            this.f133424n = new C14202ev(10);
            this.f133423m = new C14200et(10);
            this.f133419i = b();
            c();
            Runnable runnable = (Runnable) this.f133424n.poll();
            int i10 = this.f133417g;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.MINUTES, this.f133424n, new ThreadFactoryC14196ep(this));
            this.f133420j = threadPoolExecutor;
            if (runnable != null) {
                threadPoolExecutor.execute(runnable);
            }
        }
    }

    public void a(eG eGVar) {
        this.f133422l = eGVar;
    }

    public void a(InterfaceC14206ez interfaceC14206ez) {
        Iterator it = this.f133423m.iterator();
        while (it.hasNext()) {
            C14199es c14199es = (C14199es) it.next();
            switch (C14197eq.f133428b[interfaceC14206ez.a(c14199es.f133433a.f133322a, c14199es.f133446n).ordinal()]) {
                case 1:
                    return;
                case 3:
                    c14199es.a();
                    this.f133423m.remove(c14199es);
                    break;
            }
        }
    }

    public void a(String str, File file, URL url, String str2, eC eCVar, EnumC14198er enumC14198er, eD eDVar, String str3) {
        synchronized (this.f133421k) {
            if (str != null) {
                if (str.length() != 0 && str.matches("[a-zA-Z0-9-_]*")) {
                    if (eDVar == eD.UNREADY && str3 == null) {
                        throw new IllegalArgumentException("hash");
                    }
                    eE eEVarB = b(str);
                    File file2 = new File(eEVarB.f133323b, UUID.randomUUID().toString());
                    File file3 = new File(file2.getAbsolutePath() + ".metadata");
                    try {
                        FileChannel channel = new RandomAccessFile(file3, "rw").getChannel();
                        try {
                            FileLock fileLockLock = channel.lock(0L, Long.MAX_VALUE, false);
                            if (fileLockLock == null || !fileLockLock.isValid()) {
                                fG.a(channel);
                                Log.e("Failed to lock new metadata file");
                                return;
                            }
                            C14199es c14199es = new C14199es(eEVarB);
                            c14199es.f133436d = channel;
                            c14199es.f133437e = fileLockLock;
                            c14199es.f133434b = file2;
                            c14199es.f133435c = file3;
                            c14199es.f133438f = file.getName();
                            c14199es.f133442j = url;
                            c14199es.f133441i = eCVar;
                            c14199es.f133439g = d();
                            c14199es.f133440h = file.length();
                            c14199es.f133443k = str2;
                            boolean z10 = true;
                            c14199es.f133444l = enumC14198er == EnumC14198er.ENCRYPTED;
                            c14199es.f133446n = str3;
                            if (eDVar != eD.READY) {
                                z10 = false;
                            }
                            c14199es.f133445m = z10;
                            if (file.renameTo(file2)) {
                                b(c14199es);
                                a(c14199es);
                                return;
                            } else {
                                c14199es.b();
                                Log.e("Unexpected error moving file " + file.getAbsolutePath() + " -> " + file2);
                                throw new IOException("Unexpected error moving file " + file.getAbsolutePath() + " -> " + file2);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            fG.a(channel);
                            Log.e("Failed to lock new metadata file", e);
                            return;
                        } catch (OverlappingFileLockException e11) {
                            e = e11;
                            fG.a(channel);
                            Log.e("Failed to lock new metadata file", e);
                            return;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        Log.e("Failed to create new file channel", e);
                        return;
                    } catch (OverlappingFileLockException e13) {
                        e = e13;
                        Log.e("Failed to create new file channel", e);
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("session");
        }
    }

    public boolean a(String str, String str2, eF eFVar) {
        synchronized (this.f133421k) {
            try {
                if (str2 == null) {
                    throw new IllegalArgumentException("hash");
                }
                eE eEVarA = a(str);
                if (eEVarA == null) {
                    Log.w(String.format("Attempted to update a session that disappeared (session=%s/hash=%s)", str, str2));
                    return false;
                }
                C14199es c14199es = (C14199es) eEVarA.f133326e.remove(str2);
                if (c14199es == null) {
                    Log.w(String.format("Attempted to update a file that disappeared (session=%s/hash=%s)", str, str2));
                    return false;
                }
                this.f133423m.remove(c14199es);
                switch (C14197eq.f133429c[eFVar.ordinal()]) {
                    case 1:
                        c14199es.f133445m = true;
                        b(c14199es);
                        a(c14199es);
                        break;
                    case 2:
                        c14199es.a();
                        break;
                    default:
                        throw new IllegalArgumentException("action");
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
