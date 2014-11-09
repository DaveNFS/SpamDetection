#!/usr/bin/python

import urllib2
import re

# create the url first
base_url = 'http://www.thesaurus.com/browse/'
word = 'sublime'


total_url = base_url + word


response = urllib2.urlopen(total_url)
page_source = response.read()

# print page_source
response.close()

text = page_source
# m = re.search('<span class="text">(.*)</span>', text)
# print m.groups()

for m in re.finditer(r'<span class="text">(.*)</span>', text):
    temp = m.group(0)
    word = re.search('<span class="text">(.*)</span>', temp)
    print word.group(1)