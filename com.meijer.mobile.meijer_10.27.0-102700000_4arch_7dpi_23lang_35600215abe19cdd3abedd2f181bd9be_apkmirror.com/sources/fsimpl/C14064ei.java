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
/* loaded from: classes14.dex */
public class C14064ei {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f132140a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f132141b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f132142c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f132143d;

    /* renamed from: e, reason: collision with root package name */
    private final RustInterface f132144e;

    /* renamed from: h, reason: collision with root package name */
    private C14070eo f132147h;

    /* renamed from: i, reason: collision with root package name */
    private Thread f132148i;

    /* renamed from: j, reason: collision with root package name */
    private int f132149j;

    /* renamed from: f, reason: collision with root package name */
    private AtomicReference f132145f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f132146g = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    private LruCache f132150k = new LruCache(HttpResponseStatus.SUCCESS_OK);

    static {
        byte[] bytes = "{\"sha1\":[".getBytes();
        f132140a = bytes;
        f132141b = bytes.length;
        byte[] bytes2 = "]}".getBytes();
        f132142c = bytes2;
        f132143d = bytes2.length;
    }

    public C14064ei(RustInterface rustInterface, C13966ar c13966ar, C14070eo c14070eo) {
        this.f132144e = rustInterface;
        URL urlA = a(c13966ar);
        this.f132145f.set(urlA);
        this.f132146g.set(c13966ar != null);
        Log.d("Ready check: url=" + urlA + ", supported=" + c());
        this.f132147h = c14070eo;
    }

    private int a(ArrayList arrayList, OutputStream outputStream) throws IOException {
        outputStream.write(f132140a);
        int length = f132141b + 0;
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
        outputStream.write(f132142c);
        return length + f132143d;
    }

    private URL a(C13966ar c13966ar) {
        if (c13966ar == null) {
            return null;
        }
        return c13966ar.n();
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
                this.f132147h.a(str, strNextString, eF.CONFIRM_READY);
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
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14064ei.d():void");
    }

    public void a() {
        fM fMVar = new fM(new RunnableC14065ej(this), "fs-ready-check");
        this.f132148i = fMVar;
        fMVar.start();
    }

    public void b() {
        this.f132148i.interrupt();
        this.f132148i = null;
    }

    public EnumC14067el c() {
        return this.f132146g.get() ? this.f132145f.get() != null ? EnumC14067el.YES : EnumC14067el.NO : EnumC14067el.UNKNOWN;
    }
}
