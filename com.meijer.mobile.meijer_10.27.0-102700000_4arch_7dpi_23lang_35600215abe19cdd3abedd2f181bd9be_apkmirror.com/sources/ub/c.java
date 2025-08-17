package ub;

import android.content.Context;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
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
    private static final C6380a f162849d = C6381b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    static final C6382c f162850e = C6383d.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f162851a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f162852b;

    /* renamed from: c, reason: collision with root package name */
    final d f162853c;

    public final void b(String str) {
        try {
            synchronized (this) {
                try {
                    FileOutputStream fileOutputStreamE = e(this.f162851a);
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
            f162850e.g("Writing event data to file failed", e10);
        }
    }

    private FileOutputStream e(String str) {
        try {
            return this.f162852b.openFileOutput(str, 32768);
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
        return this.f162852b.getFileStreamPath(str);
    }

    public final List<String> d() {
        ArrayList arrayList = new ArrayList();
        String[] strArrFileList = this.f162852b.fileList();
        for (int i10 = 0; i10 < strArrFileList.length; i10++) {
            if (strArrFileList[i10].contains("upload-in-progress")) {
                arrayList.add(strArrFileList[i10]);
            }
        }
        return arrayList;
    }

    public c(String str, Context context, d dVar) {
        this.f162851a = str;
        this.f162852b = context;
        this.f162853c = dVar;
    }
}
