package wb;

import android.content.Context;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f167058d = C13785b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    static final C13786c f167059e = C13787d.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f167060a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f167061b;

    /* renamed from: c, reason: collision with root package name */
    final d f167062c;

    public final void b(String str) {
        try {
            synchronized (this) {
                try {
                    FileOutputStream fileOutputStreamE = e(this.f167060a);
                    if (fileOutputStreamE != null) {
                        PrintStream printStream = new PrintStream(fileOutputStreamE);
                        printStream.println(str);
                        printStream.close();
                        fileOutputStreamE.close();
                    }
                } finally {
                }
            }
        } catch (IOException e10) {
            f167059e.g("Writing event data to file failed", e10);
        }
    }

    private FileOutputStream e(String str) {
        try {
            return this.f167061b.openFileOutput(str, 32768);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                try {
                    Iterator<String> it = d().iterator();
                    while (it.hasNext()) {
                        FileInputStream fileInputStream = new FileInputStream(c(it.next()));
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                arrayList.add(line);
                            }
                        }
                        fileInputStream.close();
                        bufferedReader.close();
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public final File c(String str) {
        return this.f167061b.getFileStreamPath(str);
    }

    public final List<String> d() {
        ArrayList arrayList = new ArrayList();
        String[] strArrFileList = this.f167061b.fileList();
        for (int i10 = 0; i10 < strArrFileList.length; i10++) {
            if (strArrFileList[i10].contains("upload-in-progress")) {
                arrayList.add(strArrFileList[i10]);
            }
        }
        return arrayList;
    }

    public c(String str, Context context, d dVar) {
        this.f167060a = str;
        this.f167061b = context;
        this.f167062c = dVar;
    }
}
