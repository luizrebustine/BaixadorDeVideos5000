from pytubefix import YouTube
import sys
yt = YouTube(str(sys.argv[1]))
yt.streams.filter(res=str(sys.argv[2])).first().download("C:/Users/dudur/eclipse-workspace/BaixadorDeVideos")
print("donwload concluido!")