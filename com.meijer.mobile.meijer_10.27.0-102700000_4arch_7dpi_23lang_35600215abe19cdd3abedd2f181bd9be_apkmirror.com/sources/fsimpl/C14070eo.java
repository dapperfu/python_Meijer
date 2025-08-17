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
/* loaded from: classes14.dex */
public class C14070eo {

    /* renamed from: d, reason: collision with root package name */
    private final E f132164d;

    /* renamed from: e, reason: collision with root package name */
    private final int f132165e;

    /* renamed from: f, reason: collision with root package name */
    private final int f132166f;

    /* renamed from: g, reason: collision with root package name */
    private int f132167g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC14069en f132168h;

    /* renamed from: i, reason: collision with root package name */
    private SortedSet f132169i;

    /* renamed from: j, reason: collision with root package name */
    private ThreadPoolExecutor f132170j;

    /* renamed from: l, reason: collision with root package name */
    private eG f132172l;

    /* renamed from: m, reason: collision with root package name */
    private C14075et f132173m;

    /* renamed from: n, reason: collision with root package name */
    private C14077ev f132174n;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f132163c = new AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    private final Object f132171k = new Object();

    /* renamed from: a, reason: collision with root package name */
    eI f132161a = eI.NATURAL;

    /* renamed from: o, reason: collision with root package name */
    private AtomicInteger f132175o = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    int f132162b = 10000;

    public C14070eo(E e10, int i10, int i11, int i12, InterfaceC14069en interfaceC14069en) {
        this.f132164d = e10;
        this.f132165e = i10;
        this.f132166f = i11;
        this.f132167g = i12;
        this.f132168h = interfaceC14069en;
    }

    private eE a(String str) {
        synchronized (this.f132171k) {
            for (eE eEVar : this.f132169i) {
                if (eEVar.f132072a.equals(str)) {
                    return eEVar;
                }
            }
            return null;
        }
    }

    private C14074es a(File file, File file2, eE eEVar) throws IOException {
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            try {
                FileLock fileLockTryLock = channel.tryLock(0L, Long.MAX_VALUE, false);
                if (fileLockTryLock == null || !fileLockTryLock.isValid()) {
                    fG.a(channel);
                    return null;
                }
                JSONObject jSONObject = new JSONObject(b(file).toString());
                C14074es c14074es = new C14074es(eEVar);
                c14074es.f132186d = channel;
                c14074es.f132187e = fileLockTryLock;
                c14074es.f132191i = eC.valueOf(jSONObject.getString("priority"));
                c14074es.f132189g = jSONObject.getLong("dateMs");
                c14074es.f132184b = file2;
                c14074es.f132188f = jSONObject.getString("originalFile");
                c14074es.f132185c = file;
                c14074es.f132192j = new URL(jSONObject.getString("url"));
                c14074es.f132193k = jSONObject.optString("contentType", null);
                c14074es.f132190h = jSONObject.optLong("size", 0L);
                c14074es.f132194l = jSONObject.optBoolean("encrypted", false);
                c14074es.f132195m = jSONObject.optBoolean(OrderState.READY, true);
                c14074es.f132196n = jSONObject.optString("hash", null);
                return c14074es;
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
                if ((e10 instanceof C14068em) && ((C14068em) e10).a()) {
                    throw e10;
                }
                Log.e("Retrying after I/O failure", e10);
                try {
                    double d10 = this.f132162b;
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
            this.f132164d.a(file);
        } catch (IOException e10) {
            Log.e("Unexpectedly unable to trash file " + file.getAbsolutePath(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, IOException iOException) {
        eG eGVar = this.f132172l;
        if (eGVar != null) {
            eGVar.notify(str, str2, iOException, ((long) this.f132174n.a()) == 0 && ((long) this.f132170j.getActiveCount()) == 1);
        }
    }

    private boolean a(eE eEVar) {
        File[] fileArrListFiles = eEVar.f132073b.listFiles();
        if (fileArrListFiles == null) {
            Log.e("Unexpected error reading session directory " + eEVar.f132073b.getAbsolutePath());
            return false;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            if (file.getName().endsWith(".metadata")) {
                File file2 = new File(file.getParentFile(), file.getName().substring(0, file.getName().length() - ".metadata".length()));
                if (file2.exists()) {
                    try {
                        C14074es c14074esA = a(file, file2, eEVar);
                        if (c14074esA != null) {
                            try {
                                a(c14074esA);
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

    private boolean a(C14074es c14074es) {
        synchronized (this.f132171k) {
            eE eEVar = c14074es.f132183a;
            if (c14074es.f132195m) {
                eEVar.f132075d.add(c14074es);
            } else {
                C14074es c14074es2 = (C14074es) eEVar.f132076e.put(c14074es.f132196n, c14074es);
                if (c14074es2 != null) {
                    eEVar.f132076e.put(c14074es.f132196n, c14074es2);
                    Log.d(String.format("Got a duplicate non-ready upload with hash=%s/session=%s, ignoring", c14074es.f132196n, eEVar.f132072a));
                    c14074es.a();
                    return false;
                }
            }
            if (c14074es.f132195m) {
                ThreadPoolExecutor threadPoolExecutor = this.f132170j;
                if (threadPoolExecutor == null) {
                    this.f132174n.offer(new RunnableC14079ex(this, c14074es));
                } else {
                    threadPoolExecutor.execute(new RunnableC14079ex(this, c14074es));
                }
            } else {
                this.f132173m.offer(c14074es);
            }
            return true;
        }
    }

    private eE b(String str) {
        synchronized (this.f132171k) {
            eE eEVarA = a(str);
            if (eEVarA != null) {
                return eEVarA;
            }
            long jD = d();
            File file = new File(this.f132164d.c(), str);
            fG.a(file, this.f132164d.b());
            File file2 = new File(file, ".session");
            file2.createNewFile();
            file2.setLastModified(jD);
            eE eEVar = new eE(file, jD);
            this.f132169i.add(eEVar);
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
        File[] fileArrListFiles = this.f132164d.c().listFiles();
        if (fileArrListFiles == null) {
            Log.e("Unexpected error listing files for upload");
            return treeSet;
        }
        long jD = d();
        long jConvert = jD - TimeUnit.MILLISECONDS.convert(this.f132166f, TimeUnit.DAYS);
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
            if (treeSet.size() > this.f132165e) {
                eE eEVar = (eE) treeSet.first();
                treeSet.remove(eEVar);
                file = eEVar.f132073b;
                a(file);
            }
        }
        return treeSet;
    }

    private void b(C14074es c14074es) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        FileOutputStream fileOutputStream = new FileOutputStream(c14074es.f132185c);
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.forName("utf8"));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("priority", c14074es.f132191i);
                jSONObject.put("file", c14074es.f132184b.getAbsolutePath());
                jSONObject.put("originalFile", c14074es.f132188f);
                jSONObject.put("url", c14074es.f132192j.toString());
                jSONObject.put("session", c14074es.f132183a.f132072a);
                jSONObject.put("dateMs", c14074es.f132189g);
                jSONObject.put("contentType", c14074es.f132193k);
                jSONObject.put("size", c14074es.f132190h);
                jSONObject.put("encrypted", c14074es.f132194l);
                jSONObject.put("hash", c14074es.f132196n);
                jSONObject.put(OrderState.READY, c14074es.f132195m);
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
        Iterator it = this.f132169i.iterator();
        while (it.hasNext()) {
            eE eEVar = (eE) it.next();
            if (!a(eEVar)) {
                it.remove();
                a(eEVar.f132073b);
            }
        }
    }

    private long d() {
        switch (C14072eq.f132177a[this.f132161a.ordinal()]) {
            case 1:
                return System.currentTimeMillis();
            case 2:
                return this.f132175o.incrementAndGet() + 1500000000000L;
            default:
                return 0L;
        }
    }

    public void a() {
        synchronized (this.f132171k) {
            this.f132174n = new C14077ev(10);
            this.f132173m = new C14075et(10);
            this.f132169i = b();
            c();
            Runnable runnable = (Runnable) this.f132174n.poll();
            int i10 = this.f132167g;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.MINUTES, this.f132174n, new ThreadFactoryC14071ep(this));
            this.f132170j = threadPoolExecutor;
            if (runnable != null) {
                threadPoolExecutor.execute(runnable);
            }
        }
    }

    public void a(eG eGVar) {
        this.f132172l = eGVar;
    }

    public void a(InterfaceC14081ez interfaceC14081ez) {
        Iterator it = this.f132173m.iterator();
        while (it.hasNext()) {
            C14074es c14074es = (C14074es) it.next();
            switch (C14072eq.f132178b[interfaceC14081ez.a(c14074es.f132183a.f132072a, c14074es.f132196n).ordinal()]) {
                case 1:
                    return;
                case 3:
                    c14074es.a();
                    this.f132173m.remove(c14074es);
                    break;
            }
        }
    }

    public void a(String str, File file, URL url, String str2, eC eCVar, EnumC14073er enumC14073er, eD eDVar, String str3) {
        synchronized (this.f132171k) {
            if (str != null) {
                if (str.length() != 0 && str.matches("[a-zA-Z0-9-_]*")) {
                    if (eDVar == eD.UNREADY && str3 == null) {
                        throw new IllegalArgumentException("hash");
                    }
                    eE eEVarB = b(str);
                    File file2 = new File(eEVarB.f132073b, UUID.randomUUID().toString());
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
                            C14074es c14074es = new C14074es(eEVarB);
                            c14074es.f132186d = channel;
                            c14074es.f132187e = fileLockLock;
                            c14074es.f132184b = file2;
                            c14074es.f132185c = file3;
                            c14074es.f132188f = file.getName();
                            c14074es.f132192j = url;
                            c14074es.f132191i = eCVar;
                            c14074es.f132189g = d();
                            c14074es.f132190h = file.length();
                            c14074es.f132193k = str2;
                            boolean z10 = true;
                            c14074es.f132194l = enumC14073er == EnumC14073er.ENCRYPTED;
                            c14074es.f132196n = str3;
                            if (eDVar != eD.READY) {
                                z10 = false;
                            }
                            c14074es.f132195m = z10;
                            if (file.renameTo(file2)) {
                                b(c14074es);
                                a(c14074es);
                                return;
                            } else {
                                c14074es.b();
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
        synchronized (this.f132171k) {
            try {
                if (str2 == null) {
                    throw new IllegalArgumentException("hash");
                }
                eE eEVarA = a(str);
                if (eEVarA == null) {
                    Log.w(String.format("Attempted to update a session that disappeared (session=%s/hash=%s)", str, str2));
                    return false;
                }
                C14074es c14074es = (C14074es) eEVarA.f132076e.remove(str2);
                if (c14074es == null) {
                    Log.w(String.format("Attempted to update a file that disappeared (session=%s/hash=%s)", str, str2));
                    return false;
                }
                this.f132173m.remove(c14074es);
                switch (C14072eq.f132179c[eFVar.ordinal()]) {
                    case 1:
                        c14074es.f132195m = true;
                        b(c14074es);
                        a(c14074es);
                        break;
                    case 2:
                        c14074es.a();
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
