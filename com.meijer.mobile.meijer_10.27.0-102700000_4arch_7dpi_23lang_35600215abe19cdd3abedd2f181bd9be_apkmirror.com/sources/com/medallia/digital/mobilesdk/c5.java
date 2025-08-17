package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaRecorder;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.Window;
import androidx.appcompat.app.c;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class c5 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f91699e = 7;

    /* renamed from: f, reason: collision with root package name */
    private static final int f91700f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f91701g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final String f91702h = "/media";

    /* renamed from: i, reason: collision with root package name */
    private static final String f91703i = "video/*";

    /* renamed from: j, reason: collision with root package name */
    private static final int f91704j = 1048576;

    /* renamed from: k, reason: collision with root package name */
    private static final int f91705k = 5;

    /* renamed from: l, reason: collision with root package name */
    private static c5 f91706l;

    /* renamed from: a, reason: collision with root package name */
    private MediaRecorder f91707a;

    /* renamed from: c, reason: collision with root package name */
    private ProgressDialog f91709c;

    /* renamed from: b, reason: collision with root package name */
    private g5 f91708b = null;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f91710d = new ArrayList();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91711a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f91712b;

        static {
            int[] iArr = new int[z4.values().length];
            f91712b = iArr;
            try {
                iArr[z4.select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91712b[z4.delete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91712b[z4.replace.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91712b[z4.permission.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91712b[z4.videoTimeLimitation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[j5.values().length];
            f91711a = iArr2;
            try {
                iArr2[j5.video.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91711a[j5.audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91711a[j5.upload.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f91713a;

        b(a5 a5Var) {
            this.f91713a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f91713a.a(z4.ok);
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f91715a;

        c(a5 a5Var) {
            this.f91715a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f91715a.a(z4.delete);
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    class e implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f91718a;

        e(a5 a5Var) {
            this.f91718a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f91718a.a(z4.replace);
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    class g implements DialogInterface.OnClickListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    class h implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f91722a;

        h(a5 a5Var) {
            this.f91722a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f91722a.a(z4.ok);
        }
    }

    class i extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f91724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j2 f91725b;

        i(c.a aVar, j2 j2Var) {
            this.f91724a = aVar;
            this.f91725b = j2Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            String str;
            androidx.appcompat.app.c cVarCreate = this.f91724a.create();
            try {
                Window window = cVarCreate.getWindow();
                if (window != null) {
                    j2 j2Var = this.f91725b;
                    if (j2Var == null || !j2Var.isRtl()) {
                        window.getDecorView().setLayoutDirection(0);
                        window.getDecorView().setTextDirection(3);
                        str = "Dialog direction set to LTR";
                    } else {
                        window.getDecorView().setLayoutDirection(1);
                        window.getDecorView().setTextDirection(4);
                        str = "Dialog direction set to RTL";
                    }
                    a4.e(str);
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
            cVarCreate.show();
        }
    }

    class j extends v4 {
        j() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            Context contextB = i4.c().b();
            c5.this.f91709c = new ProgressDialog(i4.c().d());
            c5.this.f91709c.setTitle(contextB.getString(R.string.progress_dialog_title));
            c5.this.f91709c.setMessage(contextB.getString(R.string.progress_dialog_body));
            c5.this.f91709c.setProgressStyle(0);
            c5.this.f91709c.setIndeterminate(false);
            c5.this.f91709c.setCancelable(false);
            c5.this.f91709c.show();
        }
    }

    public enum k {
        denyPermission(0),
        allowAudioPermission(1),
        stopAudioRecording(2),
        finishMediaRecording(3),
        unSupportedMediaFormat(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f91734a;

        k(int i10) {
            this.f91734a = i10;
        }

        public int a() {
            return this.f91734a;
        }
    }

    c5() {
    }

    protected static c5 b() {
        if (f91706l == null) {
            f91706l = new c5();
        }
        return f91706l;
    }

    protected void c() {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new j());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void d() throws Exception {
        try {
            MediaRecorder mediaRecorder = this.f91707a;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.f91707a.release();
                this.f91707a = null;
                a4.e("Audio recording was finished");
            }
        } catch (Exception e10) {
            a4.c("Audio Recorder doesn't exist " + e10.getMessage());
            throw new Exception();
        }
    }

    public String b(Uri uri, String str, String str2) throws IOException {
        File fileA = a(str, str2);
        try {
            FileInputStream fileInputStreamCreateInputStream = i4.c().b().getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            byte[] bArr = new byte[f91704j];
            while (true) {
                int i10 = fileInputStreamCreateInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i10);
                fileOutputStream.flush();
            }
            fileInputStreamCreateInputStream.close();
            fileOutputStream.close();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return fileA.getAbsolutePath();
    }

    protected e5 a(g5 g5Var, j2 j2Var, boolean z10) {
        Activity activity = (Activity) i4.c().d().getBaseContext();
        this.f91708b = g5Var;
        ArrayList arrayList = new ArrayList();
        String strD = g5Var.d();
        if (strD != null && !strD.isEmpty()) {
            int i10 = a.f91711a[j5.a(strD).ordinal()];
            if (i10 == 1) {
                int iA = Z1.b.a(activity, "android.permission.CAMERA");
                if (iA == 0 || this.f91710d.isEmpty() || !this.f91710d.contains("android.permission.CAMERA")) {
                    if (iA != 0) {
                        arrayList.add("android.permission.CAMERA");
                    } else {
                        a(activity, g5Var.e());
                    }
                }
                a(z4.permission, (a5<z4>) null, j2Var, z10);
                return null;
            }
            if (i10 == 2) {
                int iA2 = Z1.b.a(activity, "android.permission.RECORD_AUDIO");
                if (iA2 == 0 || this.f91710d.isEmpty() || !this.f91710d.contains("android.permission.RECORD_AUDIO")) {
                    if (iA2 == 0) {
                        return a(strD, j2Var.getFormId(), j2Var.b(), g5Var.c());
                    }
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                a(z4.permission, (a5<z4>) null, j2Var, z10);
                return null;
            }
            if (i10 == 3) {
                a(activity);
            }
        }
        if (!arrayList.isEmpty()) {
            androidx.core.app.b.v(activity, (String[]) arrayList.toArray(new String[0]), 7);
        }
        return null;
    }

    protected void b(String str) {
        if (str == null || this.f91710d.contains(str)) {
            return;
        }
        this.f91710d.add(str);
    }

    protected e5 a(String str, String str2, String str3, String str4) throws IllegalStateException, IOException {
        File file = new File(g2.f(f91702h));
        String string = UUID.randomUUID().toString();
        String str5 = file + q2.f92724c + string + j5.c(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f91707a = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f91707a.setOutputFormat(1);
        this.f91707a.setAudioEncoder(4);
        this.f91707a.setOutputFile(str5);
        try {
            this.f91707a.prepare();
            this.f91707a.start();
            a4.b("Start record audio was call");
            return new e5(string, null, str5, str2, str3, j5.b(str), System.currentTimeMillis(), str4, 0);
        } catch (Exception e10) {
            a4.e("Cannot record audio media " + e10.getMessage());
            return null;
        }
    }

    protected File a(String str, String str2) {
        File file = new File(g2.d(), f91702h);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str + j5.c(str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8 A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #8 {Exception -> 0x00a3, blocks: (B:40:0x009f, B:44:0x00a8), top: B:51:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.String a(android.net.Uri r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            java.io.File r1 = r9.a(r11, r12)
            r2 = 0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            r3 = 29
            if (r0 < r3) goto L6a
            com.medallia.digital.mobilesdk.i4 r11 = com.medallia.digital.mobilesdk.i4.c()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            android.content.Context r11 = r11.b()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r10 = r11.openFileDescriptor(r10, r12)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            java.nio.channels.FileChannel r3 = r11.getChannel()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            java.nio.channels.FileChannel r8 = r10.getChannel()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            r4 = 0
            r3.transferTo(r4, r6, r8)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            r3.close()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            r3.close()     // Catch: java.lang.Exception -> L48
            if (r8 == 0) goto L91
            r8.close()     // Catch: java.lang.Exception -> L48
            goto L91
        L48:
            r0 = move-exception
            r10 = r0
            java.lang.String r10 = r10.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r10)
            goto L91
        L52:
            r0 = move-exception
            r10 = r0
        L54:
            r2 = r3
            goto L9d
        L56:
            r0 = move-exception
            r10 = r0
        L58:
            r2 = r3
            goto L6f
        L5a:
            r0 = move-exception
            r10 = r0
            r8 = r2
            goto L54
        L5e:
            r0 = move-exception
            r10 = r0
            r8 = r2
            goto L58
        L62:
            r0 = move-exception
            r10 = r0
            r8 = r2
            goto L9d
        L66:
            r0 = move-exception
            r10 = r0
            r8 = r2
            goto L6f
        L6a:
            java.lang.String r10 = r9.b(r10, r11, r12)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            return r10
        L6f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r11.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r12 = "Can not create the media file + "
            r11.append(r12)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L9b
            r11.append(r10)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L9b
            com.medallia.digital.mobilesdk.a4.c(r10)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L8c
            r2.close()     // Catch: java.lang.Exception -> L48
        L8c:
            if (r8 == 0) goto L91
            r8.close()     // Catch: java.lang.Exception -> L48
        L91:
            java.lang.String r10 = "File Saved to internal storage"
            com.medallia.digital.mobilesdk.a4.b(r10)
            java.lang.String r10 = r1.getAbsolutePath()
            return r10
        L9b:
            r0 = move-exception
            r10 = r0
        L9d:
            if (r2 == 0) goto La6
            r2.close()     // Catch: java.lang.Exception -> La3
            goto La6
        La3:
            r0 = move-exception
            r11 = r0
            goto Lac
        La6:
            if (r8 == 0) goto Lb3
            r8.close()     // Catch: java.lang.Exception -> La3
            goto Lb3
        Lac:
            java.lang.String r11 = r11.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r11)
        Lb3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.c5.a(android.net.Uri, java.lang.String, java.lang.String):java.lang.String");
    }

    protected void a() {
        ProgressDialog progressDialog = this.f91709c;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f91709c = null;
        }
    }

    protected void a(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, f91703i);
            activity.startActivityForResult(intent, 3);
        } catch (Exception e10) {
            a4.c("Upload Media from gallery Error + " + e10.getMessage());
        }
    }

    protected void a(Activity activity, int i10) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.durationLimit", i10);
            activity.startActivityForResult(intent, 2);
        } catch (Exception e10) {
            a4.c("Capture Video Error + " + e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(com.medallia.digital.mobilesdk.z4 r24, com.medallia.digital.mobilesdk.a5<com.medallia.digital.mobilesdk.z4> r25, com.medallia.digital.mobilesdk.j2 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.c5.a(com.medallia.digital.mobilesdk.z4, com.medallia.digital.mobilesdk.a5, com.medallia.digital.mobilesdk.j2, boolean):void");
    }

    public void a(String str) {
        try {
            g2.c(str);
            d();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected boolean a(Uri uri, int i10) {
        try {
            i5 i5Var = new i5();
            try {
                i5Var.setDataSource(i4.c().b(), uri);
                boolean z10 = ((int) TimeUnit.MILLISECONDS.toSeconds(Long.parseLong(i5Var.extractMetadata(9)))) + (-5) > i10;
                i5Var.close();
                return z10;
            } finally {
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return true;
        }
    }

    protected boolean a(Uri uri, ArrayList<String> arrayList) {
        ContentResolver contentResolver = i4.c().b().getContentResolver();
        if (arrayList != null) {
            try {
            } catch (Exception unused) {
                a4.e("Validate video format failed.");
            }
            if (!arrayList.isEmpty()) {
                FileDescriptor fileDescriptor = contentResolver.openFileDescriptor(uri, "r").getFileDescriptor();
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(fileDescriptor);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i10 = 0; i10 < trackCount; i10++) {
                    if (arrayList.contains(mediaExtractor.getTrackFormat(i10).getString("mime"))) {
                        a4.e("video format doesn't support");
                        return false;
                    }
                }
                return true;
            }
        }
        a4.e("unSupportedVideoFormats list is null");
        return true;
    }
}
