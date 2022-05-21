package com.example.university;

import android.app.DownloadManager;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.widget.Toast;

public class download extends Service {
    public download() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        super.onCreate();
        downloadFile();
    }
    @Override
    public  int onStartCommand(Intent intent, int flags,int startId){
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    private void downloadFile() {

        DownloadManager.Request request = new DownloadManager.Request(Uri.parse("https://drive.google.com/uc?export=download&id=1nRHGdxrtUrldRa0fdrxtbTM6HdL15SD5"));


        request.setDescription("Downloading file ");


        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);
        Toast.makeText(getApplicationContext(), "Downloading File", Toast.LENGTH_SHORT).show();

    }



}