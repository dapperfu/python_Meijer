package fsimpl;

import android.util.JsonReader;
import android.util.LruCache;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fsimpl.ei, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14189ei {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f133390a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f133391b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f133392c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f133393d;

    /* renamed from: e, reason: collision with root package name */
    private final RustInterface f133394e;

    /* renamed from: h, reason: collision with root package name */
    private C14195eo f133397h;

    /* renamed from: i, reason: collision with root package name */
    private Thread f133398i;

    /* renamed from: j, reason: collision with root package name */
    private int f133399j;

    /* renamed from: f, reason: collision with root package name */
    private AtomicReference f133395f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f133396g = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    private LruCache f133400k = new LruCache(HttpResponseStatus.SUCCESS_OK);

    static {
        byte[] bytes = "{\"sha1\":[".getBytes();
        f133390a = bytes;
        f133391b = bytes.length;
        byte[] bytes2 = "]}".getBytes();
        f133392c = bytes2;
        f133393d = bytes2.length;
    }

    public C14189ei(RustInterface rustInterface, C14091ar c14091ar, C14195eo c14195eo) {
        this.f133394e = rustInterface;
        URL urlA = a(c14091ar);
        this.f133395f.set(urlA);
        this.f133396g.set(c14091ar != null);
        Log.d("Ready check: url=" + urlA + ", supported=" + c());
        this.f133397h = c14195eo;
    }

    private int a(ArrayList arrayList, OutputStream outputStream) throws IOException {
        outputStream.write(f133390a);
        int length = f133391b + 0;
        Iterator it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                outputStream.write(44);
                length++;
            }
            outputStream.write(34);
            byte[] bytes = str.getBytes();
            outputStream.write(bytes);
            outputStream.write(34);
            length += bytes.length + 2;
        }
        outputStream.write(f133392c);
        return length + f133393d;
    }

    private URL a(C14091ar c14091ar) {
        if (c14091ar == null) {
            return null;
        }
        return c14091ar.n();
    }

    private boolean a(InputStream inputStream, HashMap map, int[] iArr) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        jsonReader.beginObject();
        if (!jsonReader.hasNext()) {
            return true;
        }
        String strNextName = jsonReader.nextName();
        if (!strNextName.equals("sha1")) {
            Log.d("Unexpected JSON key: " + strNextName);
            return false;
        }
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String strNextString = jsonReader.nextString();
            String str = (String) map.remove(strNextString);
            if (str == null) {
                iArr[3] = iArr[3] + 1;
                Log.d("Couldn't locate session for hash: " + strNextString);
            } else {
                iArr[4] = iArr[4] + 1;
                this.f133397h.a(str, strNextString, eF.CONFIRM_READY);
            }
        }
        jsonReader.endArray();
        jsonReader.endObject();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[Catch: all -> 0x0141, IllegalStateException -> 0x0143, IOException -> 0x014b, TryCatch #1 {all -> 0x0141, blocks: (B:7:0x003b, B:9:0x0042, B:12:0x0068, B:13:0x006b, B:15:0x00a1, B:17:0x00b7, B:28:0x00ce, B:27:0x00cb, B:29:0x00cf, B:30:0x00d7, B:32:0x00dd, B:33:0x00f7, B:35:0x00fc, B:36:0x013d, B:42:0x0146), top: B:51:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14189ei.d():void");
    }

    public void a() {
        fM fMVar = new fM(new RunnableC14190ej(this), "fs-ready-check");
        this.f133398i = fMVar;
        fMVar.start();
    }

    public void b() {
        this.f133398i.interrupt();
        this.f133398i = null;
    }

    public EnumC14192el c() {
        return this.f133396g.get() ? this.f133395f.get() != null ? EnumC14192el.YES : EnumC14192el.NO : EnumC14192el.UNKNOWN;
    }
}
