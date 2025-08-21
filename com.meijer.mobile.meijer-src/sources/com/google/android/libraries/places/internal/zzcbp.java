package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbp {
    public static final zzcbx zza(Socket socket) throws IOException {
        int i10 = zzcbq.zza;
        Intrinsics.j(socket, "<this>");
        zzcby zzcbyVar = new zzcby(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.i(outputStream, "getOutputStream(...)");
        zzcbr sink = new zzcbr(outputStream, zzcbyVar);
        Intrinsics.j(sink, "sink");
        return new zzcbg(zzcbyVar, sink);
    }

    public static final zzcbz zzb(Socket socket) throws IOException {
        int i10 = zzcbq.zza;
        Intrinsics.j(socket, "<this>");
        zzcby zzcbyVar = new zzcby(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.i(inputStream, "getInputStream(...)");
        zzcbo source = new zzcbo(inputStream, zzcbyVar);
        Intrinsics.j(source, "source");
        return new zzcbh(zzcbyVar, source);
    }

    public static final zzcbl zzc(zzcbz zzcbzVar) {
        Intrinsics.j(zzcbzVar, "<this>");
        return new zzcbt(zzcbzVar);
    }

    public static final zzcbk zzd(zzcbx zzcbxVar) {
        Intrinsics.j(zzcbxVar, "<this>");
        return new zzcbs(zzcbxVar);
    }
}
