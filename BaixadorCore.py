from pytubefix import YouTube
import sys
yt = YouTube(str(sys.argv[1]))
yt.streams.filter(res=str(sys.argv[2])).first().download(str(sys.argv[3]))
print("donwload concluido!")
print(sys.argv[3])