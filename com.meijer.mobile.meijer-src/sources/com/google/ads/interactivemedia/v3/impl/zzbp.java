package com.google.ads.interactivemedia.v3.impl;

/* loaded from: classes4.dex */
final class zzbp implements zzbq {
    private zzbp() {
        throw null;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00b2: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:175), block:B:42:0x00b2 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    @Override // com.google.ads.interactivemedia.v3.impl.zzbq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbz zza(com.google.ads.interactivemedia.v3.impl.data.zzby r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.lang.String r2 = r9.url()     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.net.URLConnection r1 = com.fullstory.FS.urlconnection_wrapInstance(r1)     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lb6
            java.lang.String r0 = "User-Agent"
            java.lang.String r2 = r9.userAgent()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r1.setRequestProperty(r0, r2)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            int r0 = r9.connectionTimeoutMs()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r1.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            int r0 = r9.readTimeoutMs()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r1.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            com.google.ads.interactivemedia.v3.impl.data.zzbx r0 = r9.requestType()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            com.google.ads.interactivemedia.v3.impl.data.zzbx r2 = com.google.ads.interactivemedia.v3.impl.data.zzbx.POST     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            if (r0 != r2) goto L68
            r0 = 1
            r1.setDoOutput(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r0 = 0
            r1.setChunkedStreamingMode(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r0 = r9.content()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            if (r0 == 0) goto L68
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5c
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> L5c
            r2.write(r0)     // Catch: java.lang.Throwable -> L5c
            r2.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            goto L68
        L58:
            r9 = move-exception
            goto Lb2
        L5a:
            r0 = move-exception
            goto Lba
        L5c:
            r0 = move-exception
            if (r2 == 0) goto L67
            r2.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
        L67:
            throw r0     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
        L68:
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8c
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L8c
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8c
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> L8c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L8c
        L82:
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8e
            r3.append(r2)     // Catch: java.lang.Throwable -> L8c
            goto L82
        L8c:
            r2 = move-exception
            goto La7
        L8e:
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L97
            r0.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
        L97:
            java.lang.String r0 = r1.getContentType()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r1.disconnect()
            java.lang.String r9 = r9.id()
            com.google.ads.interactivemedia.v3.impl.data.zzbz r9 = com.google.ads.interactivemedia.v3.impl.data.zzbz.forResponse(r9, r2, r0)
            return r9
        La7:
            if (r0 == 0) goto Lb1
            r0.close()     // Catch: java.lang.Throwable -> Lad
            goto Lb1
        Lad:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
        Lb1:
            throw r2     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
        Lb2:
            r0 = r1
            goto Ld9
        Lb4:
            r9 = move-exception
            goto Ld9
        Lb6:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        Lba:
            boolean r0 = r0 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto Lc9
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> L58
            r0 = 101(0x65, float:1.42E-43)
            com.google.ads.interactivemedia.v3.impl.data.zzbz r9 = com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(r9, r0)     // Catch: java.lang.Throwable -> L58
            goto Ld3
        Lc9:
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> L58
            r0 = 100
            com.google.ads.interactivemedia.v3.impl.data.zzbz r9 = com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(r9, r0)     // Catch: java.lang.Throwable -> L58
        Ld3:
            if (r1 == 0) goto Ld8
            r1.disconnect()
        Ld8:
            return r9
        Ld9:
            if (r0 == 0) goto Lde
            r0.disconnect()
        Lde:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.impl.zzbp.zza(com.google.ads.interactivemedia.v3.impl.data.zzby):com.google.ads.interactivemedia.v3.impl.data.zzbz");
    }

    /* synthetic */ zzbp(zzbo zzboVar) {
    }
}
