package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
enum j5 {
    upload,
    video,
    audio;

    protected static j5 a(String str) {
        j5 j5Var = upload;
        if (j5Var.name().equals(str)) {
            return j5Var;
        }
        j5 j5Var2 = video;
        return j5Var2.name().equals(str) ? j5Var2 : audio;
    }

    protected static String b(String str) {
        if (upload.name().equals(str) || video.name().equals(str)) {
            return "video/mp4";
        }
        if (audio.name().equals(str)) {
            return "audio/wav";
        }
        return null;
    }

    protected static String c(String str) {
        if (upload.name().equals(str) || video.name().equals(str)) {
            return ".mp4";
        }
        if (audio.name().equals(str)) {
            return ".wav";
        }
        return null;
    }

    protected static String d(String str) {
        if (str == null || !str.contains(q2.f93563c)) {
            return str;
        }
        String[] strArrSplit = str.split(q2.f93563c);
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }
}
